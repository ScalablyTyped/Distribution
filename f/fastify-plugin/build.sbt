organization := "org.scalablytyped"
name := "fastify-plugin"
version := "4.2.1-b59b7b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6482f2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-0f6ae5",
  "org.scalablytyped" %%% "fastify" % "4.9.2-ab5901",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-fde89d",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-7d417f",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-0f9508",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-8e4bd0",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-cc3999",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pino" % "8.7.0-22ef7c",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-1771f0",
  "org.scalablytyped" %%% "re2" % "1.17.7-a226e5",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-09fc3b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
