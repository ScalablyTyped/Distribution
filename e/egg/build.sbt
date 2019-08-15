organization := "org.scalablytyped"
name := "egg"
version := "2.23.0-75d099"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6d8609",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-2ae511",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-05f2a9",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-4e7246",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-b394d9",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-4653cd",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-fef066",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-694f80",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-1c5c3a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-cbb478",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-5afe6e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-618a1c",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190627Z-0c3b16",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-010b16",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "urllib" % "2.34.0-8deba9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        