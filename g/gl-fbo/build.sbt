organization := "org.scalablytyped"
name := "gl-fbo"
version := "2.0-dt-20211202Z-c0f4d4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gl-texture2d" % "2.1-dt-20211223Z-157a7b",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20211202Z-f65d3f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
