organization := "org.scalablytyped"
name := "eetase"
version := "4.0-dt-20200519Z-650521"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200902Z-a04c95",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-03387b",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-78a86b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
