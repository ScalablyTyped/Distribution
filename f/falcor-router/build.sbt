organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20221103Z-d1820b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20211202Z-492a59",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20221103Z-32836e",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20221103Z-7be659",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-fe6aef",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-3f0561",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
