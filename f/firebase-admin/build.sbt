organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.6.0-0cc57b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-4554ac",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-b04a2b",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-a93879",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.3.0-fa7100",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.5.0-f65fa9",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-1da488",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-2b3e7c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        