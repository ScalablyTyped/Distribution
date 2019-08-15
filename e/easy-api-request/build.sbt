organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20190322Z-07cf73"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-2ae511",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-ae7949",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-cecd06",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-05f2a9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-cbb478",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-5afe6e",
  "org.scalablytyped" %%% "form-data" % "2.5.0-367e7c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-d5ea6f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-590fe2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-010b16",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2c5a54")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        