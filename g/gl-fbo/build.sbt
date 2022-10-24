organization := "org.scalablytyped"
name := "gl-fbo"
version := "2.0-dt-20211202Z-d44327"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gl-texture2d" % "2.1-dt-20211223Z-c52db2",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20211202Z-444034",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
