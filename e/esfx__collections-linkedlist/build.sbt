organization := "org.scalablytyped"
name := "esfx__collections-linkedlist"
version := "1.0.0-pre.24-0e6ce4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esfx__collection-core" % "1.0.0-pre.24-2fd7de",
  "org.scalablytyped" %%% "esfx__equatable" % "1.0.0-pre.19-6cafb1",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
