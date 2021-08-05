organization := "org.scalablytyped"
name := "firebase-admin"
version := "9.4.1-fefd49"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-8c5a99",
  "org.scalablytyped" %%% "firebase__database-types" % "0.6.1-368ab4",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-af12fc",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-4d76ea",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-42c99c",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-d0f312",
  "org.scalablytyped" %%% "google-cloud__common" % "3.5.0-bbe733",
  "org.scalablytyped" %%% "google-cloud__firestore" % "4.7.1-906ada",
  "org.scalablytyped" %%% "google-cloud__storage" % "5.5.0-f47647",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-322bb1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "teeny-request" % "7.0.1-fee933")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
