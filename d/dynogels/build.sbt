organization := "org.scalablytyped"
name := "dynogels"
version := "9.0-dt-20180314Z-411ab0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.395.0-1748ee",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-746165",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-b22fa9",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190121Z-b10f91",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-c7a409",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-8c9d6d",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-4ba2ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        