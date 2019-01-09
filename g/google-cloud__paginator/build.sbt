organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-e39289"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-7e672d",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-15cee9",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-921bd7",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-12916b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-ca6c92",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-c0bf0c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        