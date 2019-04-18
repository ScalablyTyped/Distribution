organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.6.0-1c70d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.39.0-39cc7a",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-4d17fe",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-200987",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-b43721",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-0bfc0a",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-4c7dcd",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-63a268",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-7f2dcb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        