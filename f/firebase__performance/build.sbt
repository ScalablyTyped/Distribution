organization := "org.scalablytyped"
name := "firebase__performance"
version := "0.2.32-f0c949"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.1-dd0356",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.1-875251",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.35-91851c",
  "org.scalablytyped" %%% "firebase__performance-types" % "0.0.9-c0f854",
  "org.scalablytyped" %%% "firebase__util" % "0.2.40-cf6ddf",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
