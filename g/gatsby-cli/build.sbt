organization := "org.scalablytyped"
name := "gatsby-cli"
version := "2.14.0-3a471c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "4.1.0-5f22aa",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20200226Z-585a20",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20201002Z-bc0cd8",
  "org.scalablytyped" %%% "opentracing" % "0.14.5-8e7511",
  "org.scalablytyped" %%% "pretty-error" % "2.1.2-727c2e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "redux" % "4.0.5-3039e4",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20201002Z-d00df9",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
