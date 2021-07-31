organization := "org.scalablytyped"
name := "express-openapi"
version := "7.2.0-0730b9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-9ca4f0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-0ef592",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2f63a9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-2cc92e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-35349b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-694048",
  "org.scalablytyped" %%% "openapi-framework" % "7.2.0-dbd390",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-4f1b1b",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-0a8b72",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-e75eb9",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-c4075a",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-84f793",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-f5b664",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-f95694",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-aa9c35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
