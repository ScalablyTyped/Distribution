organization := "org.scalablytyped"
name := "express-async-wrap"
version := "1.0-dt-20190502Z-c2e66f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-3cac79",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200722Z-ebd859",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-556671",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3a906b",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
