organization := "org.scalablytyped"
name := "firebase-admin"
version := "9.4.1-9201e6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-680562",
  "org.scalablytyped" %%% "firebase__database-types" % "0.6.1-01d1bb",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-fc6b40",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-06d2d6",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-10471b",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-2e31d6",
  "org.scalablytyped" %%% "google-cloud__common" % "3.5.0-6b1f32",
  "org.scalablytyped" %%% "google-cloud__firestore" % "4.7.1-2a1fc5",
  "org.scalablytyped" %%% "google-cloud__storage" % "5.5.0-64ed8f",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-103072",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "teeny-request" % "7.0.1-938ecb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
