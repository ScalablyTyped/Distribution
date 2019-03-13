organization := "org.scalablytyped"
name := "google-auth-library"
version := "3.1.0-fa8dbd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-5961d3",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-439abd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-b3669a",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-dbfa59",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-72d7e2",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-42bcd5",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-ca035e",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-680a39",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-7f28fe",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-186caf",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-80a626",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        