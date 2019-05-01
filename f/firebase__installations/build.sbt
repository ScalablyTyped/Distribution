organization := "org.scalablytyped"
name := "firebase__installations"
version := "0.1.0-ba9d8e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.10-f71b36",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.1.0-5e8857",
  "org.scalablytyped" %%% "firebase__util" % "0.2.14-956cb0",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        