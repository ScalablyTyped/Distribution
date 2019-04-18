organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20190327Z-c6870a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-88d9fd",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-eda7b1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-28d2d3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-ec4530",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-bf13c7",
  "org.scalablytyped" %%% "egg" % "2.21.1-3b10f9",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.6-793df7",
  "org.scalablytyped" %%% "egg-core" % "4.16.2-6cb3e5",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-3d9042",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-10a6ea",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c7cba5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-10584a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-a9fbc4",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-efdd5a",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-291dac",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190322Z-e3f20f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-82bdb8",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "urllib" % "2.33.3-952b0c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        