organization := "org.scalablytyped"
name := "gl-fbo"
version := "2.0-dt-20211202Z-85d93b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gl-texture2d" % "2.1-dt-20211223Z-6348b3",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20211202Z-60d2c8",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
