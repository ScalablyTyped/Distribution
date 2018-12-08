organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "0.13.0-b867f8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-858569",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-88463f",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181203Z-ebdfff",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181105Z-823432",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-616b2c",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-961b6c",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-fa088a",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.1-9dfa3e",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-71341e",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-79feef",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-5e3f6c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-dfc9db",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-d054fb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-13cf29",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-34029a",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181018Z-dbddef",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2b1e0f",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-ebe297",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-c36488",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-e7eff4",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        