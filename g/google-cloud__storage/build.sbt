organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.3.4-a4010a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-a40bdc",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-89bc8b",
  "org.scalablytyped" %%% "axios" % "0.18.0-d183be",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ac9f89",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-863df9",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-88f17d",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-c7ac84",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-acb490",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-52e02f",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-aea419",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0051a6",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-c65ec6",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.13.0-f90692",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-da4058",
  "org.scalablytyped" %%% "google-cloud__common" % "0.27.0-ceb616",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-3c9844",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-fe972d",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-b6b9eb",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-039c80",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-ade785",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-4d72bf",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-c6150f",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-3b6045",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-6ba7ef",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-60874b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-4d66ea",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-66b2ff",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190117Z-716175",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-d5c79e",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-925285",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-f878a2",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-0bc71a",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-71bb10",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-527df3",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-d66e0c",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-45b70c",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-269158",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-214fbb",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-2bfc8e",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d2fe4",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-f35d60",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-7c34b6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        