organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.2-fc20e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-85087a",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-5b0dde",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-c05865",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-296523",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-e12bf7",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-8611a3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f57f78",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-83908c",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-f65764",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-11c3fe",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ffa40c",
  "org.scalablytyped" %%% "gaxios" % "1.8.1-295140",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-a33c91",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.14.1-b2970f",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-108fbf",
  "org.scalablytyped" %%% "google-cloud__common" % "0.31.0-6240d5",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-8d90e4",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-a12848",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-0c1ad8",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-fb0f7e",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-b37c98",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-9b8a18",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-785030",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-de8173",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-c41785",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-10ab9d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-0943d0",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-78af58",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-14666a",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-35dd40",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-e9e8b4",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-6de703",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-598f89",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-4d421f",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-82a0a0",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-2d5355",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-565676",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-46ee8a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        