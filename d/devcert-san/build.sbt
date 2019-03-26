organization := "org.scalablytyped"
name := "devcert-san"
version := "0.3.3-d7f5e2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "command-exists" % "1.2-dt-20181206Z-c5cb03",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-343355",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "eol" % "0.8.1-868b2d",
  "org.scalablytyped" %%% "get-port" % "4.2.0-3fccdd",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-805214",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-cec35d",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-727fc1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-a3d49d",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        