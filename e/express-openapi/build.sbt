organization := "org.scalablytyped"
name := "express-openapi"
version := "5.0.0-e6580a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-cc25f8",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-dbbefd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b2c6f4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-7b0398",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-051e33",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-63cd5e",
  "org.scalablytyped" %%% "openapi-framework" % "0.25.0-f7ce94",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-20a61c",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-02f9cd",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-59e9dd",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-78e153",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-cde569",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-f2210d",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-3dd486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        