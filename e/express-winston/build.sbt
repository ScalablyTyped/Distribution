organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20190211Z-48a40b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0c0785",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-729df7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-648fa1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-383ca3",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-e3e6bc",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4841be",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-6dcdf6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-99190d",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-95714e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-9383be",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-8bbfec",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-c1833f",
  "org.scalablytyped" %%% "winston" % "3.2.1-6b1983",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-1ebc32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        