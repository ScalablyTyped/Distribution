organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.7.0-febb06"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-c2507d",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-e1d04c",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-971fbd",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.5.0-de4e69",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.5.0-aa608a",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-10afe6",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-26980e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        