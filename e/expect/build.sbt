organization := "org.scalablytyped"
name := "expect"
version := "29.3.1-3e2721"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jest-diff" % "29.3.1-b140f8",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.3.1-3d6ecf",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.3.1-c114de",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-5acb29",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
