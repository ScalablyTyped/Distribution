organization := "org.scalablytyped"
name := "firebase-admin"
version := "9.4.1-4c07d3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-e8e6cc",
  "org.scalablytyped" %%% "firebase__database-types" % "0.6.1-aa2bbd",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-7c2e93",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-2ad999",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-7d5f42",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-933252",
  "org.scalablytyped" %%% "google-cloud__common" % "3.5.0-28f19c",
  "org.scalablytyped" %%% "google-cloud__firestore" % "4.7.1-803376",
  "org.scalablytyped" %%% "google-cloud__storage" % "5.5.0-3b4822",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-6696aa",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "teeny-request" % "7.0.1-975b2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
