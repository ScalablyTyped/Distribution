organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.0-0c9982"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-cf343a",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-4651f1",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-e12479",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-12e287",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-10afe6",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-73c49c",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        