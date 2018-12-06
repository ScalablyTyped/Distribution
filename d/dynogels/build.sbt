organization := "org.scalablytyped"
name := "dynogels"
version := "9.0-dt-20180910Z-dfa464"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.372.0-325b17",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180910Z-7d2d2b",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-d82a54",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-f53b7a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-fcb303",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-00c113",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-766ebf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        