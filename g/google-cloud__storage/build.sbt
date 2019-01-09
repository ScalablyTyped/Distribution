organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.3.4-9a382c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-7e672d",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-64ec94",
  "org.scalablytyped" %%% "axios" % "0.18.0-9b2726",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-b68dab",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-586dd8",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-ca3d5f",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-0b4338",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f9108e",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-2ea134",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-15cee9",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-9cf838",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-b357fb",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.13.0-118bec",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-b01863",
  "org.scalablytyped" %%% "google-cloud__common" % "0.27.0-99ec35",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-e39289",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-87ce0c",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-4a5e19",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-a3da61",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-91312b",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-921bd7",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-929c85",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-12916b",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-e7c000",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-a950ce",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-2b528e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3967d2",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-43b9a8",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-2d56da",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-f06327",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-94c6db",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-a362a9",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-e90e4d",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-6cb7ba",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-9e6585",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-ca6c92",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-c0bf0c",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-df9b27",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-a99e85",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-b0f6d7",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-18a59e",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-d1ddbf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        