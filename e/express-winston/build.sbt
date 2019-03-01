organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20190211Z-1dbd38"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-e7e673",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ab0cf8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c1e1a0",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3db512",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-aac9d7",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-915d3a",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-74eeff",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-96d8c5",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-c1b943",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-216e1b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9be8ed",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-e41105",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ce4a15",
  "org.scalablytyped" %%% "winston" % "3.2.1-8d6c62",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-c4390b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        