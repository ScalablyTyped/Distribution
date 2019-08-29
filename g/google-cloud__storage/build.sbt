organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "3.2.1-f9f0cc"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-b564a4",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-7673d8",
  "org.scalablytyped" %%% "google-cloud__common" % "2.1.2-b773d9",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-52be0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "teeny-request" % "5.2.1-3bba74")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        