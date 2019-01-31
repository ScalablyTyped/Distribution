organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-f41683"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-e71a1f",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-949fff",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-59b67e",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-f430c8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-c46bd6",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-c32d2e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        