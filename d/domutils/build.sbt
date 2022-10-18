organization := "org.scalablytyped"
name := "domutils"
version := "3.0.1-18877a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-d36eb3",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-424ef8",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-0ed4b9",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
