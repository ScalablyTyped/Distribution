organization := "org.scalablytyped"
name := "express-openapi"
version := "12.0.2-d0d8c0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-cccf4d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-318396",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-9fa163",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-434082",
  "org.scalablytyped" %%% "openapi-framework" % "12.0.2-93fcc9",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-9a0440",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-667c9d",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-77abc6",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-cfa0fc",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-278fdd",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-fadabd",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3bb8ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-be23bb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
