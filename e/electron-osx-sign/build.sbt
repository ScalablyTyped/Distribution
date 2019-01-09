organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-afd90e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-373ac9",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-7e0ea5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-86ee84",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-141fa1",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-bc95b7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        