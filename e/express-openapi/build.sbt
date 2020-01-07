organization := "org.scalablytyped"
name := "express-openapi"
version := "5.0.0-df9814"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-c01041",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-ea079a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-224a28",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-2df7b1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-488272",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-44215a",
  "org.scalablytyped" %%% "openapi-framework" % "0.25.0-67e263",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-ce5948",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-e1b2cf",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-734fc5",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-f4b887",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-50e363",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ba7911",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-44bdb4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        