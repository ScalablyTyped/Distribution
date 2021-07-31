organization := "org.scalablytyped"
name := "fastify-rate-limit"
version := "2.0-dt-20190128Z-772a45"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-9ca4f0",
  "org.scalablytyped" %%% "fastify" % "3.8.0-b9c5fb",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-9cda31",
  "org.scalablytyped" %%% "ioredis" % "4.17-dt-20201115Z-80371d",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-a45283",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
