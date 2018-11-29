organization := "com.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-c75860"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180910Z-b787cf",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-8dce11",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-89312f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        