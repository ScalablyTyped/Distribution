organization := "org.scalablytyped"
name := "express-openapi"
version := "12.0.2-0b5c8d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-6f01fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-c34bb1",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-21c0d6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-543174",
  "org.scalablytyped" %%% "openapi-framework" % "12.0.2-1d09d7",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-a8c33f",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-6d7010",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-8cf2e9",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-0177d9",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-11b94f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-11838a",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-77d826",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-be23bb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
