organization := "org.scalablytyped"
name := "gatsby-cli"
version := "4.24.0-29829c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20211202Z-6d9c74",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "ink" % "3.2.0-17c0a2",
  "org.scalablytyped" %%% "joi" % "17.6.2-2be84d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "opentracing" % "0.14.7-2a1199",
  "org.scalablytyped" %%% "pretty-error" % "4.0.0-378efc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-reconciler" % "0.28-dt-20220624Z-f8a5d5",
  "org.scalablytyped" %%% "redux" % "4.2.0-0fa2db",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20220818Z-13591a",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "type-fest" % "3.0.0-e72bbe",
  "org.scalablytyped" %%% "yoga-layout" % "1.9-dt-20211202Z-a7875c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
