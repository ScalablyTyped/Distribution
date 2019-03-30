organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.3-8a6192"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-3eaeb3",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-d4bc38",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-a816e1",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-a86567",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-b8125e",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-b04ef5",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-e67354",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20190322Z-62a34a",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-4b0f6d",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-ef9ad3",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-3bb744",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-f35ccf",
  "org.scalablytyped" %%% "gcp-metadata" % "1.0.0-5ec777",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "1.1.0-1dc166",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-05f0a9",
  "org.scalablytyped" %%% "google-cloud__common" % "0.31.1-fe872e",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.2.0-99add2",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.3-e5ea99",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.4.0-ccdcb9",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-e6bab1",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-96bbc3",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-778d27",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-8fdeb1",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-34c823",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-1271c7",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-5525e1",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190326Z-a38f08",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-3814f2",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-8c243b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-da2822",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-ac07a7",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-5a922c",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-9686ed",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-9bc995",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-764fe0",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6fb7ef",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-116941")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        