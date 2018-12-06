organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-335a2b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3eb23e",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-a698bb",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0c31be",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-231fe7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-112dcf",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-54c897")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        