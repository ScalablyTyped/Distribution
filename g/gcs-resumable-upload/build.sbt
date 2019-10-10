organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.2.5-7cf063"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-cf343a",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-340612",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-5750dc",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-a8be18",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-d488ce",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-2092ba",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        