organization := "org.scalablytyped"
name := "google-auth-library"
version := "2.0.1-d1a452"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-26ae5f",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180910Z-79f79b",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-44c652",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-7cd4e1",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-27d3e4",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-f6abaf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-3ce6ba",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-9f29f5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-832b10",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-4b586c",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-fe759b",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-90d6c1",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        