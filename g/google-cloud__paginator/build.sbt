organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-e576b6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-904d61",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-616b2c",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181109Z-00586d",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-0156f0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-15d5cd",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-e7eff4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        