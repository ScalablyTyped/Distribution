organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "0.14.1-e1f9e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-9b5c01",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-bfbf8a",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-708eba",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-a233cb",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-228e8f",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-1e70dd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-e0af3f",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8bf542",
  "org.scalablytyped" %%% "gaxios" % "1.8.0-9b91bd",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-718736",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-1ae63f",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-379a0a",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-c4e87c",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-e86f23",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-1ff40f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-da59e9",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-082806",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-3fda20",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-9f94bd",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-972449",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-6912c5",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-62e3dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        