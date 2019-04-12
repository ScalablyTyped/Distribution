organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.5.0-178f9b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "3.0.0-3eaeb3",
  "org.scalablytyped" %%% "arrify" % "2.0.1-d2905f",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-a816e1",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-a86567",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-3b2ea1",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-b04ef5",
  "org.scalablytyped" %%% "date-and-time" % "0.6-dt-20190223Z-b73dfb",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-787e4a",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20190322Z-b4bd95",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-4b0f6d",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-ef9ad3",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-79e87a",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-ab174c",
  "org.scalablytyped" %%% "gcp-metadata" % "1.0.0-e90a5a",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "1.1.0-905a36",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-4fee2a",
  "org.scalablytyped" %%% "google-cloud__common" % "0.32.0-807e82",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.2.0-170d05",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.3-e5ea99",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.4.0-ccdcb9",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-6563ed",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-aee04f",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-8e4a10",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-a8e5fd",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-34c823",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-1271c7",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190411Z-5a2eed",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190326Z-39c0a8",
  "org.scalablytyped" %%% "onetime" % "3.0-dt-20190225Z-5c1cea",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-c8888b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-8e6847",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-f8f9f4",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-1a266a",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-71bfc6",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-cf1a55",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-001cca",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-e88380",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-116941")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        