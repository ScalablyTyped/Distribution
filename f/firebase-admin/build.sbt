organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.13.0-7efde2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-46e384",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-5f8953",
  "org.scalablytyped" %%% "google-cloud__common" % "2.4.0-6e9ffc",
  "org.scalablytyped" %%% "google-cloud__firestore" % "3.8.6-ebc5a9",
  "org.scalablytyped" %%% "google-cloud__storage" % "4.7.0-b1a0ee",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-65912d",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "teeny-request" % "6.0.3-7fd7cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
