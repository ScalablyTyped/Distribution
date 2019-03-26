organization := "org.scalablytyped"
name := "google-auth-library"
version := "3.1.2-94ef8c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-539472",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-0bb70b",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-5c9ccd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-c776cb",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-88a938",
  "org.scalablytyped" %%% "gcp-metadata" % "1.0.0-dd41b3",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-081f9e",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-1ddf8c",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-5cac51",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-e00319",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-207e80",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190322Z-ec3c32",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-89c2de",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        