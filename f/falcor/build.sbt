organization := "org.scalablytyped"
name := "falcor"
version := "2.0-dt-20211202Z-e6361b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20220818Z-b0c85c",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20220913Z-7a2b02",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
