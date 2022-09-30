organization := "org.scalablytyped"
name := "expect"
version := "29.1.2-40fdf6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jest-diff" % "29.1.2-682b8d",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.1.2-4c4552",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.1.2-d3b524",
  "org.scalablytyped" %%% "pretty-format" % "29.1.2-3bcd6d",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
