organization := "org.scalablytyped"
name := "egg"
version := "2.24.0-43a03c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-ad672f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-9a4c55",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0179d8",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-1eaf8b",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-7e13c6",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-3fa2ff",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-8059a6",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-c0d78e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-7c2aeb",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-a10e25",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-edb551",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20191016Z-8e49fb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-3a858a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "urllib" % "2.34.1-dd8b26")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        