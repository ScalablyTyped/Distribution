organization := "org.scalablytyped"
name := "google-auth-library"
version := "3.1.0-2b1345"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-50fe36",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-188cac",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-a9baf4",
  "org.scalablytyped" %%% "gaxios" % "1.7.0-620f8c",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-cc5925",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-4d1bb7",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-41ec06",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-d96847",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-ac2bc3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-708236",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-9b754e",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-432a44",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        