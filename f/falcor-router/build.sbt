organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20201002Z-9e77cf"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20200515Z-f3ec9d",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20201002Z-e3306c",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20201002Z-8e0f62",
  "org.scalablytyped" %%% "rx" % "4.1.0-b886b6",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
