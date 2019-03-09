organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-f8fb43"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-5b0dde",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-11c3fe",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-9b8a18",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-bc15f0",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-9d8919",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-6b3621")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        