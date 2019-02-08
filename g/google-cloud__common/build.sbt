organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.31.0-e1fe41"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-b54dd4",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-1d91b0",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-c8d982",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a9baf4",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-2075a1",
  "org.scalablytyped" %%% "gaxios" % "1.4.0-65bc0e",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-46d88b",
  "org.scalablytyped" %%% "google-auth-library" % "3.0.1-f5ecc3",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-1fa8db",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-86aab6",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-30ea8c",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-1e3d3b",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-d566eb",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-ac2bc3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-9a96a4",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-05dded",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-432a44",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-926653",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-5ef703",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-fa0d8a",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        