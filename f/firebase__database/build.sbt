organization := "org.scalablytyped"
name := "firebase__database"
version := "0.5.21-13085f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.1-dd0356",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.2-38617f",
  "org.scalablytyped" %%% "firebase__component" % "0.1.5-56df44",
  "org.scalablytyped" %%% "firebase__database-types" % "0.4.11-4a6844",
  "org.scalablytyped" %%% "firebase__util" % "0.2.40-cf6ddf",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
