organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "0.13.0-dd4fd7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-51eacb",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-e33499",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-3b1929",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-d8051b",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a292c4",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-bda47a",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-7e2c40",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-c54701",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-745313",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-30ffb2",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-767513",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-ed9220",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-759fd7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-500a41",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-a2ed03",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-14a958",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2246af",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-7f5478",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-e2fd38",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-bfb6d2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a6a64a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        