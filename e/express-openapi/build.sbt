organization := "org.scalablytyped"
name := "express-openapi"
version := "12.0.2-e64f2d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-3e7752",
  "org.scalablytyped" %%% "openapi-framework" % "12.0.2-e75817",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-840e2a",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-4a9577",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-f6dc6e",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-a9c030",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-74e41e",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-be23bb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
