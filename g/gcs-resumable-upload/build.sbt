organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-b1a3d0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-aa5013",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-71c9de",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-975007",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-17684e",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-a66e0d",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-9b47fb",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
