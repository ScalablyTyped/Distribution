organization := "org.scalablytyped"
name := "express-frappe"
version := "2.1.3-62c85b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0c0785",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-729df7",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190322Z-9b1a3f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-648fa1",
  "org.scalablytyped" %%% "express-promise-router" % "2.0-dt-20190212Z-8efdc4",
  "org.scalablytyped" %%% "express-routers" % "1.0.1-5cdcdb",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-383ca3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "morgan" % "1.7-dt-20180214Z-919cf5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-9383be",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20190322Z-3491bd",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-c3e797",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        