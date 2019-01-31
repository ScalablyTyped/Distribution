organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "0.14.1-d2464d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-45e40f",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-0334cd",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-1aaffc",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-dd3a65",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-949fff",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-eabe19",
  "org.scalablytyped" %%% "gaxios" % "1.2.6-8c9af4",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-4c3755",
  "org.scalablytyped" %%% "google-auth-library" % "3.0.1-e56341",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-1356d8",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-500f31",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-eb282a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-167463",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-93f77e",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-d980ff",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-3c15f1",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-2dde48",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-df7daf",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-45dbbd",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-c32d2e",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3631a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        