organization := "org.scalablytyped"
name := "dynogels"
version := "9.0-dt-20180314Z-827c3b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.384.0-28e87d",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180226Z-2b6679",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-5d109b",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-90d510",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-4d0b7b",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-18a59e",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-be6677")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        