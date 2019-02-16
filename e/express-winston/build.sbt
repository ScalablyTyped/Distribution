organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20190211Z-2e19b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-ca81e9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-18f5bb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9d0391",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ac6847",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-5bd5ac",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-1fdb3c",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-640fda",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-d1795e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-eabe5e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-35c46b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ffe082",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-2f7239",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-becbe4",
  "org.scalablytyped" %%% "winston" % "3.2.1-5c2b02",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-ffbe8b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        