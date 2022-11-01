organization := "org.scalablytyped"
name := "diff2html"
version := "3.4.22-8f1f6d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "highlight_dot_js" % "11.6.0-6fc15f",
  "org.scalablytyped" %%% "hogan_dot_js" % "3.0-dt-20211202Z-9fe453",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
