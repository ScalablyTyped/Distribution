organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20211202Z-d17d80"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20211202Z-e6361b",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20220818Z-b0c85c",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20220913Z-7a2b02",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-a1cc09",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-c1505f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
