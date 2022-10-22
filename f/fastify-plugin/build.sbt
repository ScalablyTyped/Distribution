organization := "org.scalablytyped"
name := "fastify-plugin"
version := "4.2.1-371a98"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-66e9eb",
  "org.scalablytyped" %%% "fastify" % "4.9.2-4c3ad4",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-3b699d",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-f97171",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-7d43aa",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-fff760",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-7263e6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "pino" % "8.7.0-bde1fd",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-5cf6b2",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-b805f8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
