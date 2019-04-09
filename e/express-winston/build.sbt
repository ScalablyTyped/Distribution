organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20190211Z-c9cb55"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-a8ed72",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-6a8dc8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-14c66e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-d8c77b",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-4f02fd",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-54f634",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-dea611",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-2b0048",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-32e430",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4ceb07",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-ad49e2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-5108a8",
  "org.scalablytyped" %%% "winston" % "3.2.1-9e7784",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-17c561")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        