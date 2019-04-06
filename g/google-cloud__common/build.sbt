organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.32.0-f97003"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "3.0.0-3eaeb3",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-d4bc38",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-a816e1",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f8e3b9",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20190322Z-d9d53d",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-4b0f6d",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-ef9ad3",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-57c0e7",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-474fb3",
  "org.scalablytyped" %%% "gcp-metadata" % "1.0.0-f5269e",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-d0c424",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.3-e5ea99",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.4.0-ccdcb9",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-e61bec",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-4b6d19",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-68b4ad",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-34c823",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190403Z-8a4c08",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190326Z-2fd7c5",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ca6c55",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-6acf4e",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-d326d3",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        