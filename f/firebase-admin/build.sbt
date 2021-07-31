organization := "org.scalablytyped"
name := "firebase-admin"
version := "9.4.1-5a4c62"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-62d0a1",
  "org.scalablytyped" %%% "firebase__database-types" % "0.6.1-100b24",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-d06cb8",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-555225",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-03b8be",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-07bb56",
  "org.scalablytyped" %%% "google-cloud__common" % "3.5.0-537898",
  "org.scalablytyped" %%% "google-cloud__firestore" % "4.7.1-e78b7c",
  "org.scalablytyped" %%% "google-cloud__storage" % "5.5.0-755429",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-d03733",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "teeny-request" % "7.0.1-ea1906")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
