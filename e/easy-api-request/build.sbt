organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20181121Z-51e625"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cbd349",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-7b23ed",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fc559d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-593054",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-12a485",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-2075a1",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-306676",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-926653",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ed7327",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        