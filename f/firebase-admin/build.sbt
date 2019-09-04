organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.4.0-59cde8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-b9afec",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-2cbe82",
  "org.scalablytyped" %%% "google-cloud__common" % "2.1.2-39765e",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.2.7-fa8b06",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.2.1-83a245",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-52be0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "teeny-request" % "5.2.1-8b69a4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        