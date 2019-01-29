organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-776e57"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-a40bdc",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-aea419",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-4d72bf",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-9a9112",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-bbd999",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-4a8e3b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        