organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.9.0-52aea2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-2d6fc4",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-837b19",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-17a224",
  "org.scalablytyped" %%% "google-cloud__firestore" % "3.1.0-8c1fb1",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.5.0-855801",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-e88fa0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-75c428")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        