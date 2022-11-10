organization := "org.scalablytyped"
name := "expect"
version := "29.3.1-ac5f94"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jest-diff" % "29.3.1-77924c",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.3.1-501199",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.3.1-0941e2",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-7045d4",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
