organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.7.3-c6cfbd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-e8e6cc",
  "org.scalablytyped" %%% "firebase__component" % "0.1.21-b92955",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.4-e8c263",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-7c2e93",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.5.0-c9daa2",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-2ad999",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-bb1238",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-4689f3",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
