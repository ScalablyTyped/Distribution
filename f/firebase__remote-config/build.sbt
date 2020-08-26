organization := "org.scalablytyped"
name := "firebase__remote-config"
version := "0.1.26-eeed73"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-a40057",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.4-ddac3a",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-395863",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.1.9-8d8f55",
  "org.scalablytyped" %%% "firebase__util" % "0.3.0-58f3ff",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
