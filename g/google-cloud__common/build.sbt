organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.31.1-5b94d4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-539472",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-4a3327",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-0bb70b",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-bfb77c",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-c335a2",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20190322Z-bf0257",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-5c9ccd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-c776cb",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7e85a9",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-88a938",
  "org.scalablytyped" %%% "gcp-metadata" % "1.0.0-dd41b3",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-94ef8c",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.3-1f4911",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.4.0-1fc4cc",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-081f9e",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-1ddf8c",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-5cac51",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-e00319",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-207e80",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190322Z-ec3c32",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-89c2de",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-b714b2",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-e2d82c",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-15c8b6",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-a689e5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        