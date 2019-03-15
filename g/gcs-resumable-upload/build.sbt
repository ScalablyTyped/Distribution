organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.0.0-c36801"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-5961d3",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-7b12ec",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-3347a9",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-439abd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-b3669a",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-1a8730",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-fa036a",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-4fd3dd",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-c9ae4e",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-3a12a8",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-47de09",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-7f28fe",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-86ecb3",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-4eb609",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-d0b3d2",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-e0bf19")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        