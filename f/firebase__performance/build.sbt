organization := "org.scalablytyped"
name := "firebase__performance"
version := "0.3.1-64567c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.0-eb87b7",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.3-7db0d7",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.0-6c4dc1",
  "org.scalablytyped" %%% "firebase__performance-types" % "0.0.12-ab1550",
  "org.scalablytyped" %%% "firebase__util" % "0.2.43-3981df",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
