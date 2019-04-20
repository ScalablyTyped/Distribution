organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-b851e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-487b5b",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-c16a23",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-c9c819",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-85eb02",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-edaf46",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-8c7838",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        