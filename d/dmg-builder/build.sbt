organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.6.4-7a4d68"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.43.0-9c8a76",
  "org.scalablytyped" %%% "builder-util" % "10.0.2-a6054d",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.4-70ee1e",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-3517db",
  "org.scalablytyped" %%% "electron-publish" % "20.43.0-a37bc2",
  "org.scalablytyped" %%% "fs-extra-p" % "8.0.2-04f73b",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-a3db3b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-372092")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        