organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-4a459a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-487b5b",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-0d569a",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-6f2104",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-8115d0",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-edaf46",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-d247b7",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        