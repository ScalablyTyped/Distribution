organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.2-770c6f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-9b5c01",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-fb83b6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-e7e673",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-bfbf8a",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-708eba",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-a4a8c2",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-5c7068",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-a233cb",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-678017",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-4f3360",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-1e70dd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-e0af3f",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-41ab3d",
  "org.scalablytyped" %%% "gaxios" % "1.8.0-d761db",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-a1faba",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.14.1-428a3e",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-c4ecce",
  "org.scalablytyped" %%% "google-cloud__common" % "0.31.0-ec60eb",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-228c3c",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-f96dc1",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-8d6ee1",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-9af1b4",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-55e4e0",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-4b38fd",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-d3491f",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-69308d",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-1ff40f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-c66cae",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-1e1851",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-7168b2",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-6d0efc",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-3fda20",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-c1926b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c50522",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-3b96ff",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-5ba180",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-cd296e",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-35d71f",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-0a84d3",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-62e3dd",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-ca1b2b",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-9dfd32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        