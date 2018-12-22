organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-49f7d0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-b579a6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e4c78d",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-077fe7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b6dbcd",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-906edd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        