organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-1dc166"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-3eaeb3",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-a816e1",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-b04ef5",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-e67354",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-4b0f6d",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-ef9ad3",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-f35ccf",
  "org.scalablytyped" %%% "gcp-metadata" % "1.0.0-5ec777",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-05f0a9",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-e6bab1",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-96bbc3",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-8fdeb1",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-34c823",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-5525e1",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190326Z-a38f08",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-8c243b",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-9686ed")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        