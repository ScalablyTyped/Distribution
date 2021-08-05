organization := "org.scalablytyped"
name := "fastify-multipart"
version := "3.3.0-2efdb9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-8de37f",
  "org.scalablytyped" %%% "busboy" % "v0.2.13-dt-20200923Z-1ea229",
  "org.scalablytyped" %%% "fastify" % "3.8.0-a68660",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-acf105",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-9482ea",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
