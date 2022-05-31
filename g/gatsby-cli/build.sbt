organization := "org.scalablytyped"
name := "gatsby-cli"
version := "2.14.0-333ef1"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "4.1.0-502e56",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20200226Z-a8ac37",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20201002Z-7f9e59",
  "org.scalablytyped" %%% "opentracing" % "0.14.5-70b517",
  "org.scalablytyped" %%% "pretty-error" % "2.1.2-443bf7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "redux" % "4.0.5-213600",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20201002Z-f4eb87",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
