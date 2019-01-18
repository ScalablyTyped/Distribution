organization := "org.scalablytyped"
name := "google-auth-library"
version := "2.0.2-da4058"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-d183be",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-aea419",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-c65ec6",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-039c80",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-ade785",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-c6150f",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-6ba7ef",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-60874b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190117Z-716175",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-925285",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-71bb10",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-d66e0c",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        