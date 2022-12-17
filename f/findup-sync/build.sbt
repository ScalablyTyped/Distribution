organization := "org.scalablytyped"
name := "findup-sync"
version := "4.0-dt-20211216Z-fc192f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20211202Z-e625de",
  "org.scalablytyped" %%% "micromatch" % "4.0-dt-20221103Z-1b590d",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
