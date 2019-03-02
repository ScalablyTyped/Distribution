organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-099844"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-4a5a10",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-81375c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-5c5b32",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-3b51ba")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        