organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.31.1-e1bc3a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-5961d3",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-56c0cd",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-3347a9",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-181ef0",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-439abd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-b3669a",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-22d14e",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-1a8730",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-fa036a",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-4fd3dd",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.3-2241a3",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.4.0-68d6c2",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-c9ae4e",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-3a12a8",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-47de09",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-7f28fe",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-86ecb3",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-4eb609",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ee9a54",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-26c99f",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-b84f4e",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        