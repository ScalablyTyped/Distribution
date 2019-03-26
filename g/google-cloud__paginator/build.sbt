organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.2.0-f4da69"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-4a3327",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-c776cb",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-454b95",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-217239",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-344b33")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        