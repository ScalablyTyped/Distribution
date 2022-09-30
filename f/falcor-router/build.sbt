organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20211202Z-04e3a9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20211202Z-c5c9cc",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20220818Z-b0c85c",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20220913Z-11f468",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-452c8d",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-3b1a00",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
