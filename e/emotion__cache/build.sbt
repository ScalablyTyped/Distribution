organization := "org.scalablytyped"
name := "emotion__cache"
version := "10.0.29-2f35f9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "emotion__stylis" % "0.8.5-e0ff7b",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-d9c993",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
