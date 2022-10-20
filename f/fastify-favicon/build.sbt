organization := "org.scalablytyped"
name := "fastify-favicon"
version := "4.2.0-46a131"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-cccf4d",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-e07a11",
  "org.scalablytyped" %%% "fastify" % "4.9.2-b872ca",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-eac4eb",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-f97171",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-8dd870",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-9103ee",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-7d25c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "pino" % "8.6.1-59068b",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-4bafa0",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-076e51",
  "org.scalablytyped" %%% "re2" % "1.17.7-fadabd",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-05c7d9",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
