organization := "org.scalablytyped"
name := "fluentui__react-focus"
version := "8.8.23-dc3a01"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-466f86",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.9-bb4d68",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.10-1c5aa2",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.13-aa0f79",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-f202b2",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230623Z-cbd5eb",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-53038a",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
