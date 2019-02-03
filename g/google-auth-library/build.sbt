organization := "org.scalablytyped"
name := "google-auth-library"
version := "3.0.1-db4e29"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a9baf4",
  "org.scalablytyped" %%% "gaxios" % "1.2.8-5762ce",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-329e61",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-778a8e",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-2a5c3d",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-d714a0",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-ac2bc3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-45605c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-d2c791",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-fbf9ef",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-432a44",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        