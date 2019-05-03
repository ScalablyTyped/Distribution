organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.2.15-71f98f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.10-6f416d",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.11-96b6bc",
  "org.scalablytyped" %%% "firebase__util" % "0.2.14-f35e0a",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        