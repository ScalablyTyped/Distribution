organization := "org.scalablytyped"
name := "esfx__collections-linkedlist"
version := "1.0.0-pre.24-9d9d1c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esfx__collection-core" % "1.0.0-pre.24-a26ea0",
  "org.scalablytyped" %%% "esfx__equatable" % "1.0.0-pre.19-039437",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
