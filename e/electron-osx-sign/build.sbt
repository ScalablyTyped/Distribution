organization := "com.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-b8c1fc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20181102Z-7de560",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "plist" % "3.0-dt-20181102Z-d86e2d",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20181102Z-5c226c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        