organization := "org.scalablytyped"
name := "dmg-builder"
version := "21.2.0-380953"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-77c935",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-0a5278",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-9ef911",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-e686b4",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-68d41e",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-87ece1",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-8b71a6",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-9bf7c9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        