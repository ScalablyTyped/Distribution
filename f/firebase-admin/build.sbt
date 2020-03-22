organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.9.2-8e32cb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-36e034",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-f48e8e",
  "org.scalablytyped" %%% "google-cloud__common" % "2.4.0-a57e27",
  "org.scalablytyped" %%% "google-cloud__firestore" % "3.5.1-dc230f",
  "org.scalablytyped" %%% "google-cloud__storage" % "4.3.1-3c3421",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-7ee270",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "teeny-request" % "6.0.2-71cf9e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
