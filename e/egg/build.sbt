organization := "org.scalablytyped"
name := "egg"
version := "2.22.2-ebb088"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-337404",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f78539",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-039467",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-cfcd88",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-7dcac6",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-4d8a7a",
  "org.scalablytyped" %%% "egg-core" % "4.17.2-ba74b2",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-7ebf91",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-a399fb",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-046e36",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-f895cb",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9b0098",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-71c1a5",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-97aa3d",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190616Z-857d65",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d489cc",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "urllib" % "2.34.0-0556c6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        