organization := "org.scalablytyped"
name := "express-openapi"
version := "5.0.0-2c4230"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-0354ec",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b0b0d9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-f02e41",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-92e6db",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-1ddd6d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-d3b7b2",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-b7dec9",
  "org.scalablytyped" %%% "openapi-framework" % "0.25.0-f77509",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-90501c",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-9bd0d5",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-571b80",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-481acf",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-6f2880",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a681e2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a1ed43",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-44bdb4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        