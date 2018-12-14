organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "0.13.0-68f3bf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-d01cc1",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-a94dbd",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181203Z-b8ffb5",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181105Z-da1442",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-a5898c",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-26a7b4",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-50ac81",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.1-71c5ef",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-2ec120",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-905bb5",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-62b8c2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-cc200a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-91487f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-dbd933",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-307b85",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181018Z-4cc552",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-ee0213",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-bd7bd3",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-8ca982",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-250926",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-eb91fb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        