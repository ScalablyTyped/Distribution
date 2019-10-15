organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.6.0-1d2809"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-dfa135",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-e75fdc",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-e4b304",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.3.0-063821",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.4.0-77b31b",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-1da488",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-ed4dc1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        