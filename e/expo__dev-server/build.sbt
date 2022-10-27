organization := "org.scalablytyped"
name := "expo__dev-server"
version := "0.1.120-0899c7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-fcbdcb",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-b23fc5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-3d7cf7",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "expo__bunyan" % "4.0.0-d4793b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-366150",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-9a2f2c",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-b7495b",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-4e47af",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-3f4b57",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-99bd9c",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-b51cdd",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-3a2cc9",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "re2" % "1.17.7-18b669",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-9310ee",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-641d67",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-2ad085")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
