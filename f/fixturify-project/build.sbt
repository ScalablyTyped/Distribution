organization := "org.scalablytyped"
name := "fixturify-project"
version := "5.1.0-8f3c8f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fixturify" % "2.1.1-c6f33d",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-19e0f3",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "type-fest" % "3.1.0-3dc798")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
