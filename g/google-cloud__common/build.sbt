organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.31.0-6240d5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-85087a",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-5b0dde",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-c05865",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f57f78",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-83908c",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-f65764",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-11c3fe",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ffa40c",
  "org.scalablytyped" %%% "gaxios" % "1.8.1-295140",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-a33c91",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-108fbf",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-a12848",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-0c1ad8",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-fb0f7e",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-b37c98",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-de8173",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-c41785",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-0943d0",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-78af58",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-e9e8b4",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-6de703",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-2d5355",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        