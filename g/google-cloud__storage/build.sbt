organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.3.4-0135ff"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-035afc",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-1551fb",
  "org.scalablytyped" %%% "axios" % "0.18.0-ae3618",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ca4bc1",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-cf74fb",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-79d07a",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-ab883d",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-719f5f",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-df896e",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-689ccb",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-efd843",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-10f822",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.13.0-5949ad",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-dfa1be",
  "org.scalablytyped" %%% "google-cloud__common" % "0.27.0-2f4e1e",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-ec0f66",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-b70f45",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-df5210",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-afaf27",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-2542ea",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-c5992e",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-63238d",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-e15a00",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-94152a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-038998",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-d150af",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-ba4b99",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-0ff4aa",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-eff54e",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-bdff6a",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-de4d42",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-d2b9fb",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-3782a6",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-554c41",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6f52c3",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-e2dbb5",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-f8b95d",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-bc4efd",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-7fdc70",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a404a3",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-7936ed",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-6363b3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        