organization := "org.scalablytyped"
name := "express-openapi"
version := "5.0.0-ad3070"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-52b713",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b36108",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0f3dc",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-24df32",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4dd221",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-4412ea",
  "org.scalablytyped" %%% "openapi-framework" % "0.25.0-ed592f",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-9a3207",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-af956b",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-ea86ad",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-842a9b",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-47c407",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-37db83",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-8a79a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        