organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-093eef"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-041603",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-120804",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-b25c1f",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-27747e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-c6e68e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-967a66")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        