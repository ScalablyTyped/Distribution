organization := "org.scalablytyped"
name := "fastify"
version := "4.6.0-58eae6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "buffer" % "6.0.3-3c44f1",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.3.0-aaffb0",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-0e0874",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-651389",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-33d153",
  "org.scalablytyped" %%% "find-my-way" % "7.2.0-fe6a19",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-0b28a4",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "pino" % "8.6.1-0a83e2",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-40b424",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-efc26f",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-cfa707",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
