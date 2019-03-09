organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.31.0-fcf4e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.3-85087a",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-5b0dde",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-c05865",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-d46223",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-e616cb",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-f65764",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-11c3fe",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e66f03",
  "org.scalablytyped" %%% "gaxios" % "1.8.2-7fa3d1",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-52f592",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-8e7e4a",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-a12848",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-0c1ad8",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-763ac2",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-3005a4",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-25c961",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-c41785",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-95f41a",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-8c8d6d",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-21f55d",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-0858ce",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-38e679",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        