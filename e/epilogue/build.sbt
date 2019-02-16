organization := "org.scalablytyped"
name := "epilogue"
version := "0.7-dt-20180712Z-295aa7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-18f5bb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9d0391",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-3dadf8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ac6847",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-5bd5ac",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190212Z-5ff1e7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ffe082",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-93e6e9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        