organization := "org.scalablytyped"
name := "glob-promise"
version := "6.0.2-ebf621"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "glob" % "10.2.3-1751b4",
  "org.scalablytyped" %%% "minimatch" % "9.0.0-cb80cd",
  "org.scalablytyped" %%% "minipass" % "5.0.0-110cf0",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
