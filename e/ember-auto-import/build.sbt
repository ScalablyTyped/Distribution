organization := "org.scalablytyped"
name := "ember-auto-import"
version := "2.6.3-8976a3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-aebde1",
  "org.scalablytyped" %%% "babel__core" % "7.20-dt-20230118Z-e25db7",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-589aa7",
  "org.scalablytyped" %%% "babel__parser" % "7.21.8-43580a",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-a71ff4",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20230426Z-96f2d9",
  "org.scalablytyped" %%% "babel__types" % "7.21.5-fbdd8a",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-e6dafa",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-0b9fdf",
  "org.scalablytyped" %%% "broccoli-plugin" % "4.0.7-a140f2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-61a6dc",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-c415ea",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "re2" % "1.18.0-6019fb",
  "org.scalablytyped" %%% "schema-utils" % "4.0.1-ac38e5",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b557e4",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-e3e084",
  "org.scalablytyped" %%% "webpack" % "5.82.1-4ed941")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
