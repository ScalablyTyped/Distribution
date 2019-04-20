organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-173ff2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0aa3ae",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-59abb5",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-37ce53",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-17767a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-f9a52b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-a993f8",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8a324d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-65b8ac",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-70f635",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-bad4a0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-36601b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        