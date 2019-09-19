organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.6.0-bb75cf"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-25d105",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-ae56e7",
  "org.scalablytyped" %%% "google-cloud__common" % "2.1.2-134681",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.3.0-b6a301",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.2.1-380f24",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-52be0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "teeny-request" % "5.2.1-5261d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        