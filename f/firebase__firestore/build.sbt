organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.14.5-d164c0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-0036be",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-95f6e1",
  "org.scalablytyped" %%% "firebase__component" % "0.1.12-865e07",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.10.2-6688ca",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.4-cf862b",
  "org.scalablytyped" %%% "firebase__util" % "0.2.47-004b7a",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.18-4c1f5f",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "protobufjs" % "6.9.0-eb372e",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "typescript" % "3.9.3-b53cb0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
