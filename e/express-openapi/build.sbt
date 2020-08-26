organization := "org.scalablytyped"
name := "express-openapi"
version := "7.0.0-beb397"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.3-b48cf0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-3a735c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-3cac79",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200706Z-53ce1b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200722Z-ebd859",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-298525",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.0-a695ec",
  "org.scalablytyped" %%% "openapi-framework" % "7.0.0-f45229",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.0.0-42ea27",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.0.0-6808c7",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.0-f18584",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.0-395bd0",
  "org.scalablytyped" %%% "openapi-types" % "7.0.0-9d9925",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-556671",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3a906b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-4f6d32",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-c62ef1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
