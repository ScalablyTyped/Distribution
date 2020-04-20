organization := "org.scalablytyped"
name := "electron-publish"
version := "22.5.1-16339f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "22.5.1-61e1f5",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.0-9bf6a1",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-202838",
  "org.scalablytyped" %%% "fs-extra" % "8.1-dt-20200218Z-851188",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-7f9846",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-f04091")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
