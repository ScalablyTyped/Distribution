organization := "org.scalablytyped"
name := "express-frappe"
version := "2.1.3-0cc310"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-34f287",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-202759",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20180423Z-de7a0b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-0c8b00",
  "org.scalablytyped" %%% "express-promise-router" % "2.0-dt-20180214Z-bfc2f1",
  "org.scalablytyped" %%% "express-routers" % "1.0.1-6cb005",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd70e8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "morgan" % "1.7-dt-20180214Z-3986ef",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-22f3a9",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-a7ff5f",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-444403",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        