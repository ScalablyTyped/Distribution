organization := "org.scalablytyped"
name := "egg"
version := "2.23.0-474d40"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-93a6c5",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-aabbef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db6ee1",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-88e72c",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-292866",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-423e9c",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-7ddaae",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-1c5b81",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-3b7640",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-dff786",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6958e3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-edb300",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190627Z-728707",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-e134e0",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "urllib" % "2.34.1-79237b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        