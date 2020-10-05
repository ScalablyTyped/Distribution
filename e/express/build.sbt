organization := "org.scalablytyped"
name := "express"
version := "4.17-dt-20200706Z-8c73d8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-4e311f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-147ed2",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200722Z-ad54ad",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-2804ea",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-16cddc",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-16080f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-9592a6",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-495fe1",
  "org.scalablytyped" %%% "std" % "3.9-7c0472")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
