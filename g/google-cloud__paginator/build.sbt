organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-1f6a05"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-4c03df",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-6e554f",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181109Z-a386d6",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-f5fde4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-fd9e86",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-2fcd2e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        