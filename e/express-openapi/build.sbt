organization := "org.scalablytyped"
name := "express-openapi"
version := "12.0.2-2356d4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-19ae4f",
  "org.scalablytyped" %%% "openapi-framework" % "12.0.2-c214e0",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-56dd67",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-2bfb55",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-d872db",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-db6cea",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-b4085e",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-6df737",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
