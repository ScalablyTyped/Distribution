organization := "org.scalablytyped"
name := "gl-fbo"
version := "2.0-dt-20211202Z-28fa89"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gl-texture2d" % "2.1-dt-20221230Z-b3f9ca",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20211202Z-4eb734",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
