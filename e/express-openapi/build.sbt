organization := "org.scalablytyped"
name := "express-openapi"
version := "12.0.2-cc73e8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-eec5d4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-693358",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-434082",
  "org.scalablytyped" %%% "openapi-framework" % "12.0.2-ffcedc",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-9a0440",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-bc65e7",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-9df6ad",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-cfa0fc",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-278fdd",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-91f487",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-be23bb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
