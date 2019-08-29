organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-4fe7ec"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-105136",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-ef9f97",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-c0ff92",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-517334",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-676404",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-f1a335",
  "org.scalablytyped" %%% "form-data" % "2.5.1-729a3f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-ff56fb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-fa2eda",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-2a850b",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-011dc6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        