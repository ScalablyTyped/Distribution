organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.1.1-7c84bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-ff323c",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-b4bdc9",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-fee0d8",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-c9609e",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-86d5a2",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-ea2bee",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        