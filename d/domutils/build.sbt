organization := "org.scalablytyped"
name := "domutils"
version := "3.0.1-ce5845"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-c3f9e3",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-cd7455",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-9e96e8",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
