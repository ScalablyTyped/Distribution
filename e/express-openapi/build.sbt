organization := "org.scalablytyped"
name := "express-openapi"
version := "12.0.2-388f78"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-744d03",
  "org.scalablytyped" %%% "openapi-framework" % "12.0.2-9493da",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-3ab4a8",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-832c5e",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-694faa",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-2e75f3",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-96d428",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-6df737",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
