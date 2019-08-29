organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.2.4-fd6559"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-78bcce",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-cc16af",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-b564a4",
  "org.scalablytyped" %%% "google-auth-library" % "5.1.1-7673d8",
  "org.scalablytyped" %%% "gtoken" % "3.0.2-52be0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-028c9f",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        