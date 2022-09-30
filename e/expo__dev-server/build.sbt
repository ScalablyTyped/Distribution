organization := "org.scalablytyped"
name := "expo__dev-server"
version := "0.1.120-4817e7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-480a63",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-92678d",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-e2199b",
  "org.scalablytyped" %%% "expo__bunyan" % "4.0.0-bbc8f5",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fff97a",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-065057",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-8167e2",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-46ffc4",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-935e3f",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-a96de3",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-aa97ac",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-650af8",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-91c697",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-635366",
  "org.scalablytyped" %%% "source-map" % "0.7.4-09b2a8",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tapable" % "2.2.1-981407",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3",
  "org.scalablytyped" %%% "webpack" % "5.74.0-504ec9",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
