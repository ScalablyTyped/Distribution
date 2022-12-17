organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20221103Z-7bac40"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20211202Z-634d41",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20221103Z-9ecfd6",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20221103Z-ea2dd7",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-5fdb06",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-503950",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
