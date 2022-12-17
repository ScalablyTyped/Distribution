organization := "org.scalablytyped"
name := "fastify-favicon"
version := "4.2.0-b25b4e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "buffer" % "6.0.3-053422",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-6a76d8",
  "org.scalablytyped" %%% "fastify" % "4.9.2-7e810a",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-990929",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-066829",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-bf820e",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-07a138",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-751b70",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "pino" % "8.7.0-3f0d6e",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-02af79",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-23665c",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
