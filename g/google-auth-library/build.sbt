organization := "org.scalablytyped"
name := "google-auth-library"
version := "2.0.2-0fe87f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-cf4236",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-120804",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-5b44b4",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-804b4a",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-d2e25d",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-080f7f",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-45e34b",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-90c559",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-8a7040",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-457a7e",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-8377fd",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-5afbca",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        