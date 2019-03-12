organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20190211Z-e96acc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0873eb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-d0697e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-d62561",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cfce5e",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-1589f7",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4841be",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-6dcdf6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-8e905e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-696ff5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ac5a09",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-8bbfec",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-c1833f",
  "org.scalablytyped" %%% "winston" % "3.2.1-2f06d7",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-c17570")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        