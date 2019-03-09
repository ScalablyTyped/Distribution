organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20190211Z-59cf1c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c60c6c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a449b6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-48f106",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-deeb53",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-6eeb29",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4e8c11",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-34fdd0",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-1cc6bc",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0aee39",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-78bbd1",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-c8ed4c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-bcda47",
  "org.scalablytyped" %%% "winston" % "3.2.1-ef0573",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-c864c9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        