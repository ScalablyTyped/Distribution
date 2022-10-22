organization := "org.scalablytyped"
name := "expo__dev-server"
version := "0.1.120-fb10f6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-480a63",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-5e93f8",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "expo__bunyan" % "4.0.0-e07b74",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-29531b",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-8167e2",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-f33595",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-41cd68",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-031be3",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-61e708",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-6a15f1",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-286dce",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-547e57",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7eb940",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "webpack" % "5.74.0-bd3f64",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-a7f58f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
