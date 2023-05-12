organization := "org.scalablytyped"
name := "esfx__collections-linkedlist"
version := "1.0.0-pre.24-fc01cc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esfx__collection-core" % "1.0.0-pre.24-0b9c97",
  "org.scalablytyped" %%% "esfx__equatable" % "1.0.0-pre.19-65fd4d",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
