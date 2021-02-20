organization := "org.scalablytyped"
name := "fastify-jwt"
version := "2.1.3-1f096b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ajv" % "6.12.6-44caf4",
  "org.scalablytyped" %%% "fastify" % "3.8.0-5c81ea",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-fcd567",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-aa4f2d",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-daaec0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
