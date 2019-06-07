organization := "org.scalablytyped"
name := "firebase__installations"
version := "0.1.5-3e4ffd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.0-4deedf",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.1.1-4cf80d",
  "org.scalablytyped" %%% "firebase__util" % "0.2.18-953250",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        