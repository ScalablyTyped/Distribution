organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.3.1-dc3fb5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-8cd3e7",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6d9978",
  "org.scalablytyped" %%% "axios" % "0.18.0-26ae5f",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-4e4989",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180910Z-3a5080",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-d66d65",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181203Z-241685",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181105Z-91b7ed",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180910Z-e5a6d9",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-79f79b",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-8a5f77",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-44c652",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.13.0-31cf5a",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.1-d1a452",
  "org.scalablytyped" %%% "google-cloud__common" % "0.26.2-fb2b62",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-131f41",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-280d1f",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-6523e4",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-7cd4e1",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-27d3e4",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181109Z-9b2a96",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-f53336",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-f6abaf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-3ce6ba",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-9f29f5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180910Z-f9d190",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-ebe499",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-832b10",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180910Z-916e2a",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-4b586c",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181018Z-2a7197",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-6afb39",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-fe759b",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-1bddb8",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-90d6c1",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-0be214",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-e28716",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-6f0461",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-07ce90",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-07b459",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180910Z-4911a8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        