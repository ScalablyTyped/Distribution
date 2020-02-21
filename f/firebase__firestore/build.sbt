organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.10.2-8e1461"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.1-dd0356",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.2-38617f",
  "org.scalablytyped" %%% "firebase__component" % "0.1.5-56df44",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.9.1-05d7d1",
  "org.scalablytyped" %%% "firebase__util" % "0.2.40-cf6ddf",
  "org.scalablytyped" %%% "grpc" % "1.21.1-ca1325",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-51815b",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "typescript" % "3.7.5-a12244")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
