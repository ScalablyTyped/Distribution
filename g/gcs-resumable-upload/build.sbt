organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "0.13.0-16f9b7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-cf4236",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-d86840",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-5adeec",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f60678",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-120804",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e0579d",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-5b44b4",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-0fe87f",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-804b4a",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-d2e25d",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-080f7f",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-45e34b",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-90c559",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-8a7040",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-457a7e",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-b4f5e0",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2a9ed6",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-8377fd",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-5afbca",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-967a66",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a8bc3f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        