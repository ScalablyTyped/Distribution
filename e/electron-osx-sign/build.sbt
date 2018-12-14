organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-de3e62"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-a2fdef",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-9f2619",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-ab6005",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-ed550e",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-3cf58d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        