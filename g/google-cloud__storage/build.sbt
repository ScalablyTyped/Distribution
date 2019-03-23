organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.3-baf570"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-5961d3",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-56c0cd",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-3d6c75",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-916594",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-7b12ec",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-1b7e22",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20190322Z-11990e",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-439abd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-b3669a",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-34b699",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-e7946e",
  "org.scalablytyped" %%% "gcp-metadata" % "1.0.0-0c68bc",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "1.0.0-341bc4",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.1-203595",
  "org.scalablytyped" %%% "google-cloud__common" % "0.31.1-c9fc08",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.2.0-a082ca",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.3-2241a3",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.4.0-68d6c2",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-ac5ccf",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-185635",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-f10671",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-9dc5c1",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-7f28fe",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-7f42e3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-c63ed2",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190322Z-93661d",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-bb69fa",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-937816",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-24808b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c78680",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-5a33ec",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-7cb9d6",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-f5a4b7",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-897b16",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-af9181",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-d1745b",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-751124")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        