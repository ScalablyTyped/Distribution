organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.1-3789fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-e71a1f",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-64883e",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-45e40f",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-0334cd",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-de9583",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-c07949",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-1aaffc",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-dd3a65",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-c03da1",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-949fff",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-eabe19",
  "org.scalablytyped" %%% "gaxios" % "1.2.6-8c9af4",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-4c3755",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.14.1-d2464d",
  "org.scalablytyped" %%% "google-auth-library" % "3.0.1-e56341",
  "org.scalablytyped" %%% "google-cloud__common" % "0.30.2-559475",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-f41683",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-c96220",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-a63e83",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-1356d8",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-500f31",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-59b67e",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-f430c8",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-eb282a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-167463",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-4792f0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-93f77e",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-d980ff",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-a239a8",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-3c15f1",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-2dde48",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-df7daf",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-890ce1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-45dbbd",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-c46bd6",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-c32d2e",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-a45dba",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-f77d7a",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3631a3",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-29e273",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-24b21d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        