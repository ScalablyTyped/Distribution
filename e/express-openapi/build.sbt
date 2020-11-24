organization := "org.scalablytyped"
name := "express-openapi"
version := "7.2.0-175ede"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.6-6699f6",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-7b4fa7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-931cf5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-c593b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-c653a3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-5d04c6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-aab060",
  "org.scalablytyped" %%% "openapi-framework" % "7.2.0-e21451",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-ffb097",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-923cc3",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-591c74",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-a02991",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-8525ca",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-1cff6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-237e1c",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-a8f9cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
