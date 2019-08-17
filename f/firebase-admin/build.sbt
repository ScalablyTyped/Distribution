organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.3.0-15025b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-e13381",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-cb5ba7",
  "org.scalablytyped" %%% "google-cloud__common" % "2.1.0-801344",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.2.4-ef939c",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.1.0-a23dd2",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-c46eab",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "teeny-request" % "5.1.3-7b86dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        