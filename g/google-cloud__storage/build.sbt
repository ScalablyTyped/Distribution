organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.2-f81b62"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-85087a",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-5b0dde",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-c05865",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-296523",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-423c52",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-8611a3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-d46223",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-e616cb",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-f65764",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-11c3fe",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e66f03",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-7fa3d1",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-52f592",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.14.1-cf73e8",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-8e7e4a",
  "org.scalablytyped" %%% "google-cloud__common" % "0.31.0-fcf4e6",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-f8fb43",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-a12848",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-0c1ad8",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-763ac2",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-3005a4",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-9b8a18",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-bc15f0",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-25c961",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-c41785",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-10ab9d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-95f41a",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-8c8d6d",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-14666a",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-3db940",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-21f55d",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-0858ce",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-9d8919",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-6b3621",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-03e9e5",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-38e679",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-49c2de",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-46ee8a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        