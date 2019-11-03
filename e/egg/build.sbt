organization := "org.scalablytyped"
name := "egg"
version := "2.25.0-cfdb3f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-403fc4",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-e7066f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-76449c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-61b3e7",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-7e13c6",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-3fa2ff",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-ab5e20",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-c0d78e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-35383f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-ab49c4",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-caa3ba",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20191016Z-c52966",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6b473e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "urllib" % "2.34.1-d70540")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        