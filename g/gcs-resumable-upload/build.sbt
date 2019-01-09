organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "0.13.0-118bec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-9b2726",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-b68dab",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-0b4338",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-f9108e",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-15cee9",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-9cf838",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-b357fb",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-b01863",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-a3da61",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-91312b",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-929c85",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-e7c000",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-a950ce",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-43b9a8",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-f06327",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-94c6db",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-a362a9",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-e90e4d",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-9e6585",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-c0bf0c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-b0f6d7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        