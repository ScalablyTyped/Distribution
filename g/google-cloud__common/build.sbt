organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.31.1-a59cce"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-5961d3",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-56c0cd",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-a0a387",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-3ea318",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-439abd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-b3669a",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7c4227",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-f588d3",
  "org.scalablytyped" %%% "gcp-metadata" % "1.0.0-371b6b",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.1-2aaa85",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.3-2241a3",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.4.0-68d6c2",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-04dcaf",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-738995",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-9ee2e0",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-7f28fe",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-d54d74",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190318Z-c0cf13",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ed2106",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-7870f8",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-5d5e8c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        