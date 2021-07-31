organization := "org.scalablytyped"
name := "findup-sync"
version := "2.0-dt-20201002Z-78b16d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20200515Z-f205ec",
  "org.scalablytyped" %%% "micromatch" % "4.0-dt-20201002Z-a0f468",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
