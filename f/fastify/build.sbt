organization := "org.scalablytyped"
name := "fastify"
version := "4.9.2-539430"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-34b6a7",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-892982",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-81937e",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-b8c599",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-adc441",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-ea12e6",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-3b9a22",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "pino" % "8.7.0-b181b2",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-145026",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-df3c84",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
