organization := "org.scalablytyped"
name := "express-openapi"
version := "12.0.2-709365"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-2d3ed0",
  "org.scalablytyped" %%% "openapi-framework" % "12.0.2-603134",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-9db1d7",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-1d9b36",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-7a3420",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-ee6dbe",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-79fb18",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-6df737",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
