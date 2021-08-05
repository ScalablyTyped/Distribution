organization := "org.scalablytyped"
name := "diff2html"
version := "3.1.15-d9544b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "highlight_dot_js" % "10.4.0-d994cd",
  "org.scalablytyped" %%% "hogan_dot_js" % "3.0-dt-20190925Z-8b6e12",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
