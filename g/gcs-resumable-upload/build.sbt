organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-8a951e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-4feff3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-a4c27b",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-02ca6b",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-f0accd",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-420d70",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-798e1a",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        