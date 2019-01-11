organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-ec0f66"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-035afc",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-689ccb",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-c5992e",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-e15a00",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-e2dbb5",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-f8b95d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        