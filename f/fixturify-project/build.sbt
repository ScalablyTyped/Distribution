organization := "org.scalablytyped"
name := "fixturify-project"
version := "5.1.0-e6a74c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fixturify" % "2.1.1-6f8f70",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-033b8a",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "type-fest" % "3.1.0-7d1237")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
