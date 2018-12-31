organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-eb0b64"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-5ecdf6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-54b1d3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b934d4",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-e9a3f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        