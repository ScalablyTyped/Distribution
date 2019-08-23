organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.4.0-d993d8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-273123",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-299c84",
  "org.scalablytyped" %%% "google-cloud__common" % "2.1.2-50cbd3",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.2.7-9afd03",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.2.0-2a8195",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-c46eab",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "teeny-request" % "5.2.1-ee0fa8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        