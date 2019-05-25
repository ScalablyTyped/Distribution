organization := "org.scalablytyped"
name := "egg"
version := "2.22.2-874b60"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-0af1bc",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9371e4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d00fa7",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-fc55f3",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-b987ee",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-0746f4",
  "org.scalablytyped" %%% "egg-core" % "4.17.2-011cd9",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-de8e78",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-6cb20c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-eb949a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-ba44ed",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b7c6ed",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-83298c",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-9c4bc7",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190322Z-2bae9b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c144dc",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "urllib" % "2.34.0-709a2d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        