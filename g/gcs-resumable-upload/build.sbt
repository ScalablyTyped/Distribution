organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "0.14.1-7e5213"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-85087a",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-c05865",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-8611a3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-773ec7",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-f65764",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-11c3fe",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-545269",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-fd19ea",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-327239",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-47e39d",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-3bf6e4",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-4db011",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-eaa4f9",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-c41785",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-9a6119",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-ee34db",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-77c000",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-60eef1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-2ddfca",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        