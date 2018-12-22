organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-a6427e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-68d6da",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a292c4",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-297aa0",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-29acb6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-9907c8",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-bfb6d2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        