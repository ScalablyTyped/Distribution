organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.3.4-87d2aa"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-041603",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-0b1654",
  "org.scalablytyped" %%% "axios" % "0.18.0-cf4236",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-d86840",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-f47b4c",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-f43a18",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-5adeec",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f60678",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-60038e",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-120804",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e0579d",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-5b44b4",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.13.0-16f9b7",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-0fe87f",
  "org.scalablytyped" %%% "google-cloud__common" % "0.27.0-1af6f4",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-093eef",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-568011",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-e5602c",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-804b4a",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-d2e25d",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-b25c1f",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-080f7f",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-27747e",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-45e34b",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-90c559",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-764c50",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3aadd3",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-8a7040",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-0d7cf8",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-457a7e",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-b4f5e0",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2a9ed6",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-8377fd",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-667976",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-5afbca",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-c6e68e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-967a66",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-ae6276",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-99d098",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a8bc3f",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-34dde2",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-371fd8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        