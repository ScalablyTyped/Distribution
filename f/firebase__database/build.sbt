organization := "org.scalablytyped"
name := "firebase__database"
version := "0.8.1-963fa7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-e8e6cc",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-b47cd8",
  "org.scalablytyped" %%% "firebase__component" % "0.1.21-b92955",
  "org.scalablytyped" %%% "firebase__database-types" % "0.6.1-aa2bbd",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-7c2e93",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-2ad999",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
