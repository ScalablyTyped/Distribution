organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.31.0-eb346b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-b54dd4",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-1ce883",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-d636b1",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a9baf4",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-b6386f",
  "org.scalablytyped" %%% "gaxios" % "1.5.1-a2e27f",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-c972f8",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-96e5be",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-1fa8db",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-86aab6",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-9c3919",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-53f30d",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-9587b8",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-ac2bc3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-aa13bf",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-964f6a",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-432a44",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-0f018f",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-3f4036",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-bc8068",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        