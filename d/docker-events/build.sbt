organization := "org.scalablytyped"
name := "docker-events"
version := "0.0-dt-20211202Z-6ba86f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "docker-modem" % "3.0-dt-20211202Z-060856",
  "org.scalablytyped" %%% "dockerode" % "3.3-dt-20220930Z-067609",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "ssh2" % "v1.11-dt-20220930Z-481eb1",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
