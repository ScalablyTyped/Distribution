organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.6.0-a0136d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-58bd30",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-463bc3",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-2fddc6",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.3.0-4207a5",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.3.1-3ad715",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-7444f3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "teeny-request" % "5.2.1-2af1b6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        