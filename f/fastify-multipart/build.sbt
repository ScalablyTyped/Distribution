organization := "org.scalablytyped"
name := "fastify-multipart"
version := "3.3.0-04efd2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-3e2017",
  "org.scalablytyped" %%% "busboy" % "v0.2.13-dt-20200923Z-28c13f",
  "org.scalablytyped" %%% "fastify" % "3.8.0-6abbff",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-b9f013",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-eda016",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
