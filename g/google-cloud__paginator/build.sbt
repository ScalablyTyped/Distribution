organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-8d90e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-5b0dde",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-11c3fe",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-9b8a18",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-785030",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-598f89",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-4d421f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        