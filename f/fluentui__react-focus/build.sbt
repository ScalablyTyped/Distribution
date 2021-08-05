organization := "org.scalablytyped"
name := "fluentui__react-focus"
version := "7.16.18-73c072"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-ea69bf",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-118334",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "1.1.1-94b8e1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-test-renderer" % "17.0-dt-20201120Z-7cb002",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-cf6d2f",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-bf59dd",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.19.1-857895",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.33.2-bd0313")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
