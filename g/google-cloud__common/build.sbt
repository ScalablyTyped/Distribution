organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.27.0-2f4e1e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-035afc",
  "org.scalablytyped" %%% "axios" % "0.18.0-ae3618",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ca4bc1",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-719f5f",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-df896e",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-689ccb",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-efd843",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-10f822",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-dfa1be",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-b70f45",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-df5210",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-afaf27",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-2542ea",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-63238d",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-94152a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-038998",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-0ff4aa",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-bdff6a",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-d2b9fb",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-3782a6",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-554c41",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6f52c3",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-7fdc70",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a404a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        