organization := "org.scalablytyped"
name := "express-openapi"
version := "5.0.0-d8c5b4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-3573c2",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-f180da",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d03b6a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-d92710",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4d11bc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-12c9b7",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-a669fe",
  "org.scalablytyped" %%% "openapi-framework" % "0.25.0-1deb92",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-c31e33",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-84310e",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-e47519",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-e6ebd1",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-559860",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4ff83c",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-3dd486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        