organization := "org.scalablytyped"
name := "dynogels"
version := "9.0-dt-20180314Z-ddf1fb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.418.0-7e0e5d",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-c05865",
  "org.scalablytyped" %%% "buffer" % "5.2.1-ef8f8f",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-585ca8",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-eb5e01",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-916abe",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-e47fea",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-49c2de",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-c3f585")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        