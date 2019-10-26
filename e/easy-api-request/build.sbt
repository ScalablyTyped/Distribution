organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-d93973"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-673836",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-82f58f",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-e2b4ac",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9a66bf",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-534eff",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-5bc067",
  "org.scalablytyped" %%% "form-data" % "2.5.1-de8a94",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-c879d1",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-89e7fe",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-532a00",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-b1eaaa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        