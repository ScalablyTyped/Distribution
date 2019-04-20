organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20190327Z-dfe549"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-88ab74",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0aa3ae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-17767a",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-fb147a",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-bf13c7",
  "org.scalablytyped" %%% "egg" % "2.21.1-bbb2e8",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.6-793df7",
  "org.scalablytyped" %%% "egg-core" % "4.16.2-6738d3",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-3d9042",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-10a6ea",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-f9a52b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-a993f8",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-a9fbc4",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-d463b9",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-291dac",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190322Z-f2c8f2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-bad4a0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "urllib" % "2.33.3-f2dd2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        