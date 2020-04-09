organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.13.1-e59736"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.0-6658a6",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.4-802cac",
  "org.scalablytyped" %%% "firebase__component" % "0.1.8-a641cf",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.10.1-a36715",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.0-1da808",
  "org.scalablytyped" %%% "firebase__util" % "0.2.43-c7dc16",
  "org.scalablytyped" %%% "grpc" % "1.24.2-85e23f",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "protobufjs" % "6.8.9-76f5f2",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "typescript" % "3.8.3-07d300")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
