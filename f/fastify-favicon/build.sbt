organization := "org.scalablytyped"
name := "fastify-favicon"
version := "4.2.0-f70032"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-20bcca",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-e699ba",
  "org.scalablytyped" %%% "fastify" % "4.9.2-71f242",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-8081e9",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-7d417f",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-03df2b",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-c977a3",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-58b680",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "pino" % "8.7.0-4105aa",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-a79a24",
  "org.scalablytyped" %%% "re2" % "1.17.7-5ddb3b",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-0cfca7",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
