organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.8.0-53b12f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-534dde",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-b143d9",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-3082d8",
  "org.scalablytyped" %%% "google-cloud__firestore" % "2.6.0-854a3e",
  "org.scalablytyped" %%% "google-cloud__storage" % "3.5.0-074108",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-420d70",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-364491")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        