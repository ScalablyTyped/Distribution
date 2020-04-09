organization := "org.scalablytyped"
name := "firebase-admin"
version := "8.10.0-d04fa7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-b01bfb",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-a1820b",
  "org.scalablytyped" %%% "google-cloud__common" % "2.4.0-46ed94",
  "org.scalablytyped" %%% "google-cloud__firestore" % "3.7.1-009566",
  "org.scalablytyped" %%% "google-cloud__storage" % "4.7.0-c1529b",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-7ee270",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "teeny-request" % "6.0.3-a82de1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
