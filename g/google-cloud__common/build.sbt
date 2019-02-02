organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.30.2-86a618"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-e71a1f",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-45e40f",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-0334cd",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-99c636",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-cf13b3",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-949fff",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7c0763",
  "org.scalablytyped" %%% "gaxios" % "1.2.6-f68ec6",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-81980a",
  "org.scalablytyped" %%% "google-auth-library" % "3.0.1-90ceef",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-c96220",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-a63e83",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-3a832f",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-7166f2",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-d05a30",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-167463",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-351386",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-cf4660",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-3c15f1",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c301e1",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-15ad19",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-45dbbd",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-3b675d",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3631a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        