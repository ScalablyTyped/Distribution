organization := "org.scalablytyped"
name := "express-openapi"
version := "5.0.0-874154"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-04ae0e",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-e7066f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-76449c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-35383f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-ab49c4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-b03a13",
  "org.scalablytyped" %%% "openapi-framework" % "0.25.0-c350df",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-767217",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-964606",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-23aca1",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-12b6a8",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-9734cb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6b473e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-8a79a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        