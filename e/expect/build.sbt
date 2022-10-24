organization := "org.scalablytyped"
name := "expect"
version := "29.2.1-995b06"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jest-diff" % "29.2.1-dc17ce",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.2.1-52f7ea",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.2.1-a19937",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-d73ee0",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
