organization := "org.scalablytyped"
name := "express-winston"
version := "3.0-dt-20180831Z-b90e32"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-89bc8b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e9bff8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-014b69",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-fc1b93",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-eee1c1",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-110fbc",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-845012",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-823163",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-70cb56",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-bb2b16",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f9c9b0",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-111f11",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ae8e92",
  "org.scalablytyped" %%% "winston" % "3.2.0-8990d0",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-b44294")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        