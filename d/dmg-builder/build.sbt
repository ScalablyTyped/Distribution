organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.6.0-6bf080"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.39.0-e95a7a",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-036061",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-999b0f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-bc840e",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-676d24",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-c66d7f",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-4f2200",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-5ee1d3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        