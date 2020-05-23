organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20200515Z-474463"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-5329e6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-0d29cd",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-cf4980",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-4db3c4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-9eb2b7",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200515Z-c2bfc2",
  "org.scalablytyped" %%% "form-data" % "3.0.0-81582a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-593c89",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "q" % "1.5-dt-20200515Z-2e7e19",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7ad812",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-cd197c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-fef1ef",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9da187",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200515Z-ec5ef6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
