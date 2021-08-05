organization := "org.scalablytyped"
name := "express-openapi"
version := "7.2.0-8f7181"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-8de37f",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-1ee684",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-fb786d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-4e2465",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-418907",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-33fd07",
  "org.scalablytyped" %%% "openapi-framework" % "7.2.0-a24af2",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-14351b",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-4952c7",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-04a10a",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-b39bc9",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-3515d8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-805ca8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-e007a0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-22aab1",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-aa9c35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
