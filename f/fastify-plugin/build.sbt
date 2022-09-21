organization := "org.scalablytyped"
name := "fastify-plugin"
version := "4.2.1-b1af5a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "buffer" % "6.0.3-1325ca",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.3.0-87050c",
  "org.scalablytyped" %%% "fastify" % "4.6.0-26cd4e",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-bb7d4c",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-5c359b",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-76c229",
  "org.scalablytyped" %%% "find-my-way" % "7.2.0-c4186c",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-2702a0",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "pino" % "8.6.0-b63ec5",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-ed7d9a",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-d522a5",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-620a90",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
