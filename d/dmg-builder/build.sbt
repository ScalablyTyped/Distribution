organization := "org.scalablytyped"
name := "dmg-builder"
version := "22.4.1-ca28ee"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "22.4.1-ce9276",
  "org.scalablytyped" %%% "builder-util" % "22.4.1-4d2fbc",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.6.2-aea875",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-552094",
  "org.scalablytyped" %%% "electron-publish" % "22.4.1-e3f3b0",
  "org.scalablytyped" %%% "fs-extra" % "8.1-dt-20200218Z-1bff41",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-aa089f",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-99e56d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
