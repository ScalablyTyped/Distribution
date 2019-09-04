organization := "org.scalablytyped"
name := "egg"
version := "2.23.0-a6685d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-f3acdc",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-df943a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9a5b07",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-4940ec",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-75cd95",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-990b21",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-58a7d5",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-0f2216",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-302042",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-2563ef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-c41353",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-0d114c",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190627Z-9af4f2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-7db036",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "urllib" % "2.34.1-ea4606")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        