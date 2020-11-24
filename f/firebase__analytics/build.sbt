organization := "org.scalablytyped"
name := "firebase__analytics"
version := "0.6.2-824f5c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__analytics-types" % "0.4.0-64e302",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-31a3e1",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.4-ba62aa",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-9c20e7",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-d923c6",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
