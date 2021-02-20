organization := "org.scalablytyped"
name := "firebase__remote-config"
version := "0.1.30-c42063"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-e8e6cc",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.4-e8c263",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-7c2e93",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.1.9-6a50c9",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-2ad999",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
