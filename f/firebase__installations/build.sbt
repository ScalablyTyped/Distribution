organization := "org.scalablytyped"
name := "firebase__installations"
version := "0.4.4-03ccd2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.2-1e8550",
  "org.scalablytyped" %%% "firebase__component" % "0.1.6-27b292",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.2-6744f9",
  "org.scalablytyped" %%% "firebase__util" % "0.2.41-fc37fa",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
