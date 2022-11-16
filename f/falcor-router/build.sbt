organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20221103Z-84cdeb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20211202Z-677f4f",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20221103Z-9ecfd6",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20221103Z-0f61bb",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-5c29f5",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-f23ef0",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
