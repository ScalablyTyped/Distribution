organization := "org.scalablytyped"
name := "express-openapi"
version := "12.0.2-438916"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6f26a9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-d74acb",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-06d29e",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-434082",
  "org.scalablytyped" %%% "openapi-framework" % "12.0.2-726f4e",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-9a0440",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-865d55",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-c859c7",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-cfa0fc",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-278fdd",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-e9900d",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-696f82",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-be23bb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
