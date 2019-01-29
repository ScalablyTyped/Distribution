organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20180831Z-bb04fb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-89bc8b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-34f287",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-202759",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-0c8b00",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd70e8",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-bb7c59",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-845012",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-823163",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-e7bb58",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-42aadd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-22f3a9",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-111f11",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ae8e92",
  "org.scalablytyped" %%% "winston" % "3.2.0-5c71b9",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-37736f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        