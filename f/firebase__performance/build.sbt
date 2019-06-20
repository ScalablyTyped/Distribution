organization := "org.scalablytyped"
name := "firebase__performance"
version := "0.2.7-5e7d48"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.0-bf5729",
  "org.scalablytyped" %%% "firebase__performance-types" % "0.0.2-1d548a",
  "org.scalablytyped" %%% "firebase__util" % "0.2.19-8af9ab",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        