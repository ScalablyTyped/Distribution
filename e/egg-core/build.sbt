organization := "org.scalablytyped"
name := "egg-core"
version := "4.16.2-fb1b11"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-548493",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-58078f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b54bcb",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-ac8609",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-bf13c7",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-3d9042",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-647453",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-7a04b0",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-a9fbc4",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-4c470c",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-291dac",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4dbd53",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        