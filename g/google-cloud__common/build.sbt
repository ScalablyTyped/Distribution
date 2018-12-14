organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.26.2-88314b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-8cd3e7",
  "org.scalablytyped" %%% "axios" % "0.18.0-26ae5f",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-4e4989",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181105Z-e97409",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180910Z-9ee9f1",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-79f79b",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-909c16",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-44c652",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.1-17f32b",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-280d1f",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-6523e4",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-a4e94a",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-f64da0",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-04a910",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-3ce6ba",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-9f29f5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-2d19ff",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-4b586c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-27ad3c",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-fe759b",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-cd68f7",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-90d6c1",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-f1d5dc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        