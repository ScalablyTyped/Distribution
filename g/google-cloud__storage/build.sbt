organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "3.5.0-53446a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-1c8aa6",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-54e5df",
  "org.scalablytyped" %%% "google-cloud__common" % "2.2.2-95fc86",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-f1e932",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "teeny-request" % "5.3.0-cc580a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        