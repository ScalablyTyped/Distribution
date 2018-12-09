organization := "org.scalablytyped"
name := "google-auth-library"
version := "2.0.1-392100"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-059ef2",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-6e554f",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-8dc964",
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
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-7081db",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b342e2",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        