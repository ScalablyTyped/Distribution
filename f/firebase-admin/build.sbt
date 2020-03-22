organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.10.0-5a0bb0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-7dc3c2",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-000460",
  "org.scalablytyped" %%% "google-cloud__common" % "2.4.0-b2070b",
  "org.scalablytyped" %%% "google-cloud__firestore" % "3.7.1-d3c17e",
  "org.scalablytyped" %%% "google-cloud__storage" % "4.6.0-71ee4e",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-7ee270",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "teeny-request" % "6.0.3-b996a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
