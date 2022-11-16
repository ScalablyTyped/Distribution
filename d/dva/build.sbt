organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-abe02e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "history" % "5.3.0-d9387d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-router" % "6.4.2-5821ea",
  "org.scalablytyped" %%% "react-router-dom" % "6.4.2-3d62f5",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20220712Z-a43ab7",
  "org.scalablytyped" %%% "redux" % "4.2.0-0479e7",
  "org.scalablytyped" %%% "remix-run__router" % "1.0.2-22668f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
