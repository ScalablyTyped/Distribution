organization := "org.scalablytyped"
name := "fastify-rate-limit"
version := "2.0-dt-20190128Z-4076e3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-8de37f",
  "org.scalablytyped" %%% "fastify" % "3.8.0-a68660",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-acf105",
  "org.scalablytyped" %%% "ioredis" % "4.17-dt-20201115Z-9ea529",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-9482ea",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
