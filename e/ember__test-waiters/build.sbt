organization := "org.scalablytyped"
name := "ember__test-waiters"
version := "3.0.2-f356d0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "htmlbars-inline-precompile" % "3.0-dt-20220126Z-3e5bf7",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20230328Z-925ad9",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
