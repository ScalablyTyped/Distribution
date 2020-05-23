organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.12.1-7c2ec1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-1e95bd",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-1a52ea",
  "org.scalablytyped" %%% "google-cloud__common" % "2.4.0-2e48a5",
  "org.scalablytyped" %%% "google-cloud__firestore" % "3.8.0-72d11f",
  "org.scalablytyped" %%% "google-cloud__storage" % "4.7.0-56a1a9",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-5a5680",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "teeny-request" % "6.0.3-e1b7e0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
