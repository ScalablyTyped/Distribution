organization := "org.scalablytyped"
name := "express-openapi"
version := "6.0.0-720d81"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.0-4a5655",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e73a63",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-269b22",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200303Z-1c1293",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200225Z-dbe850",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-6002a4",
  "org.scalablytyped" %%% "openapi-framework" % "0.26.0-009265",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.4.0-fefd5d",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.2.0-444c02",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-1bceae",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-c26b33",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-ca8819",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-dc6343",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-ef4bf4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
