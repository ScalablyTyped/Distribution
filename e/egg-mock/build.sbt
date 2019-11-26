organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20190327Z-931e69"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-70b5a2",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-9b6106",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ec07f0",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-d48710",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-80691c",
  "org.scalablytyped" %%% "egg" % "2.25.0-34da2f",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-513691",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-578935",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-1ec0d1",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-13b33a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-da006c",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-ac68aa",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20191016Z-1a6c3f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-335844",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "urllib" % "2.34.1-9371f1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        