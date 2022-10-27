organization := "org.scalablytyped"
name := "fastify"
version := "4.9.2-45777f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-fcbdcb",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-ad23da",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-6f920d",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-7d417f",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-af7d11",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-84a718",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-7d51c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "pino" % "8.7.0-1e72c0",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-e4959c",
  "org.scalablytyped" %%% "re2" % "1.17.7-18b669",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-d1def4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
