organization := "org.scalablytyped"
name := "express-openapi"
version := "7.2.0-26f21a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-3e2017",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-ad3420",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4e45b6",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2d5437",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-44f8de",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-162477",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-fc421a",
  "org.scalablytyped" %%% "openapi-framework" % "7.2.0-0dc4ca",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-0b6e2d",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-06de8b",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-b7e1fd",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-cc88de",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-decfd1",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-64e6f9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-329d84",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-bcf4d7",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-aa9c35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
