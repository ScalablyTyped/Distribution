organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.26.2-251438"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-4c03df",
  "org.scalablytyped" %%% "axios" % "0.18.0-059ef2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-dcf8bd",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181105Z-dc0965",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180910Z-cd2880",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-6e554f",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-c69c6e",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-8dc964",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.1-392100",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-8bc540",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-c42a32",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-91336a",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-5c4834",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-e2fce3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-e35935",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-fa35eb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-60e32c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-e97669",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-cb0d57",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-6fc249",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-7081db",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-a498c5",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b342e2",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-d3b4a6",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a4b796")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        