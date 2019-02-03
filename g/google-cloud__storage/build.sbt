organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.1-994786"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-b54dd4",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-ca81e9",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-efbc0c",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-201cb5",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-98f3fe",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-de17f3",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-ccb1c0",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a9baf4",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-c97100",
  "org.scalablytyped" %%% "gaxios" % "1.2.8-5762ce",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-329e61",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.14.1-c960b4",
  "org.scalablytyped" %%% "google-auth-library" % "3.0.1-db4e29",
  "org.scalablytyped" %%% "google-cloud__common" % "0.30.2-dbc9bf",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-835ae1",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-1fa8db",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-86aab6",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-778a8e",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-2a5c3d",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-2af66c",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-bc33f4",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-d714a0",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-ac2bc3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-45605c",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-90c444",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-d2c791",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-fbf9ef",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-bc7336",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-432a44",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-b7a69d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-277b25",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-6f3b83",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-ca8f66",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-ac3c52",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-2ccbe0",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-28458a",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-7c0b14",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-93ed9f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        