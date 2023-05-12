organization := "org.scalablytyped"
name := "gl-fbo"
version := "2.0-dt-20211202Z-9f1c2e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gl-texture2d" % "2.1-dt-20221230Z-54947a",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20211202Z-a844ec",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
