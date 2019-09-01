organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.4.0-06f382"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-b43438",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-bb7e3b",
  "org.scalablytyped" %%% "google-cloud__common" % "2.1.2-aa7425",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.2.7-2a39bc",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.2.1-b22f44",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-52be0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "teeny-request" % "5.2.1-a77108")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        