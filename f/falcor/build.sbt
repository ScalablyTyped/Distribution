organization := "org.scalablytyped"
name := "falcor"
version := "2.0-dt-20221230Z-20a8bd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20221103Z-9ecfd6",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20221103Z-db6423",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
