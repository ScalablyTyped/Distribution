organization := "org.scalablytyped"
name := "expect"
version := "29.3.1-de5ae9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jest-diff" % "29.3.1-fe1dfb",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.3.1-b37448",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.3.1-89e5b7",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-5c00f4",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
