organization := "org.scalablytyped"
name := "fastify"
version := "4.9.2-28445d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6f26a9",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.3.0-aebbc1",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-b1944f",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-f97171",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-4e8468",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-c39b35",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-5968cc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "pino" % "8.6.1-db7929",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-4bafa0",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-fdfc4d",
  "org.scalablytyped" %%% "re2" % "1.17.7-e9900d",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-fb4c83",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
