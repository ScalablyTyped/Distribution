organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20190327Z-5f0ac6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1abe8c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bfc0a3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-468aa7",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-d8d7fe",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-2fd760",
  "org.scalablytyped" %%% "egg" % "2.22.2-2da9b5",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-793d8f",
  "org.scalablytyped" %%% "egg-core" % "4.17.2-6775e5",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-9207c8",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-352e35",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c27d44",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-c3ce7d",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-18f96c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-43b872",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-052743",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190322Z-82a69e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-6731ec",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3e1146",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d55a89",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "urllib" % "2.34.0-a7038b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        