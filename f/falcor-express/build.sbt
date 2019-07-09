organization := "org.scalablytyped"
name := "falcor-express"
version := "0.1.2-dt-20190322Z-5f58b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-041fae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0256e3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-2f223f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-5ccdcb",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20190212Z-b97b58",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190322Z-000be1",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190322Z-e169dc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-496baf",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        