organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.3.1-290b9f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-904d61",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-42f75e",
  "org.scalablytyped" %%% "axios" % "0.18.0-858569",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-88463f",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180910Z-6d4db9",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-189899",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181203Z-ebdfff",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181105Z-823432",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180910Z-cfa81c",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-616b2c",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-961b6c",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-fa088a",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.13.0-b867f8",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.1-9dfa3e",
  "org.scalablytyped" %%% "google-cloud__common" % "0.26.2-a18f25",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-e576b6",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-740137",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-77eeb3",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-71341e",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-79feef",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181109Z-00586d",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-0156f0",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-5e3f6c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-dfc9db",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-d054fb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180910Z-909275",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-dbcdca",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-13cf29",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180910Z-76e664",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-34029a",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181018Z-dbddef",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2b1e0f",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-ebe297",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-983680",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-c36488",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-15d5cd",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-e7eff4",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-083ea4",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-f36a40",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-00c113",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180910Z-2f6306")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        