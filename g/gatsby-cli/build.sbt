organization := "org.scalablytyped"
name := "gatsby-cli"
version := "2.14.0-7fdc78"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "4.1.0-2c3558",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20200226Z-41ab40",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20201002Z-9ba2ea",
  "org.scalablytyped" %%% "opentracing" % "0.14.5-87d5be",
  "org.scalablytyped" %%% "pretty-error" % "2.1.2-7cb84d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "redux" % "4.0.5-119b89",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20201002Z-5da6c0",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
