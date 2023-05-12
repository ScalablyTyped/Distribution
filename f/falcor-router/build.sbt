organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20221103Z-b6a97e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20221230Z-16d0c2",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20221103Z-9ecfd6",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20221103Z-5aae0c",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20230322Z-58cd9a",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20230322Z-9914e9",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
