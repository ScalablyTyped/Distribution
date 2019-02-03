organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-b67636"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-54cdd6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-18ad8e",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-c8d096",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-47c210",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-b7a701")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        