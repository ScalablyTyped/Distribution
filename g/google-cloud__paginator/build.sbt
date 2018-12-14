organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-5c75c4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-54c33b",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-a5898c",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181109Z-2c538c",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-eab6c6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-3088d4",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-250926")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        