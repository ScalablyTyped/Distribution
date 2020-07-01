organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.15.5-9341f1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-924929",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-baeb5e",
  "org.scalablytyped" %%% "firebase__component" % "0.1.15-3e36ec",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.11.0-355393",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.5-9e97a2",
  "org.scalablytyped" %%% "firebase__util" % "0.2.50-04c0ec",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.18-595522",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "protobufjs" % "6.9.0-8bd81a",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "typescript" % "3.9.5-0b3ab7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
