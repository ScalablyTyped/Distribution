organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.3.1-532e66"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-4c03df",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-c71af2",
  "org.scalablytyped" %%% "axios" % "0.18.0-059ef2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-dcf8bd",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180910Z-bc62a8",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-8b668b",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181203Z-6e0874",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181105Z-dc0965",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180910Z-cd2880",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-6e554f",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-c69c6e",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-8dc964",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.13.0-10f46e",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.1-392100",
  "org.scalablytyped" %%% "google-cloud__common" % "0.26.2-251438",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-1f6a05",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-8bc540",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-c42a32",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-91336a",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-5c4834",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181109Z-a386d6",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-f5fde4",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-e2fce3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-e35935",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-fa35eb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-60e32c",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180910Z-0f7def",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-a76757",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-e97669",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180910Z-ba20b1",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-cb0d57",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181018Z-318b53",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-6fc249",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-7081db",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-a498c5",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b342e2",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-fd9e86",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-2fcd2e",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-bda010",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-d3b4a6",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a4b796",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-ba3729",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180910Z-0987cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        