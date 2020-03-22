organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.3.28-32cf8f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.2-1e8550",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.3-143133",
  "org.scalablytyped" %%% "firebase__component" % "0.1.6-27b292",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.3.10-ffa06a",
  "org.scalablytyped" %%% "firebase__util" % "0.2.41-fc37fa",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
