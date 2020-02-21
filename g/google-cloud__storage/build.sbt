organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "3.5.0-da81b8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-975007",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-17684e",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-aa0449",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-a66e0d",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-4e5793")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
