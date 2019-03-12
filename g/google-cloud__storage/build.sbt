organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.2-556a5b"
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
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-144ca7",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-7b12ec",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-51a776",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-24a9a5",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-439abd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-b3669a",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-696f06",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-ae1173",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-06456c",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.14.1-ae3356",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-95f0ab",
  "org.scalablytyped" %%% "google-cloud__common" % "0.31.0-56a61b",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-d39ab8",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-2241a3",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-15a810",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-3d7809",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-357a1a",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-74de59",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-279c61",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-cc3cfb",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-7f28fe",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-7f42e3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-e0cf78",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-d94c28",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-bb69fa",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-36451c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-1a0420",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-e2a178",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-b2759a",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-32b845",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-ca374e",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-0aa8da",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-2eb57f",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-751124")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        