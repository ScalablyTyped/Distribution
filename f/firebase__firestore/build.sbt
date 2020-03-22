organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.11.2-95516a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.2-1e8550",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.3-143133",
  "org.scalablytyped" %%% "firebase__component" % "0.1.6-27b292",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.9.2-5fc666",
  "org.scalablytyped" %%% "firebase__util" % "0.2.41-fc37fa",
  "org.scalablytyped" %%% "grpc" % "1.24.2-cd9b89",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-48e413",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "typescript" % "3.8.3-4c59b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
