organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.10.0-66ee90"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-1032d8",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-0c4590",
  "org.scalablytyped" %%% "google-cloud__common" % "2.4.0-d851c7",
  "org.scalablytyped" %%% "google-cloud__firestore" % "3.7.1-182216",
  "org.scalablytyped" %%% "google-cloud__storage" % "4.7.0-0e2f37",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-302f8c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "teeny-request" % "6.0.3-eeea97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
