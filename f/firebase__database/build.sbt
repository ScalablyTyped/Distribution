organization := "org.scalablytyped"
name := "firebase__database"
version := "0.4.4-e8d20e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.0-4deedf",
  "org.scalablytyped" %%% "firebase__database-types" % "0.4.0-817052",
  "org.scalablytyped" %%% "firebase__util" % "0.2.18-953250",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        