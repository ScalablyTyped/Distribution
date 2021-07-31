organization := "org.scalablytyped"
name := "falcor-router"
version := "0.8-dt-20201002Z-f2d181"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20200515Z-6a0b43",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20201002Z-e3306c",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20201002Z-075c9d",
  "org.scalablytyped" %%% "rx" % "4.1.0-a9b1fd",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
