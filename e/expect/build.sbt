organization := "org.scalablytyped"
name := "expect"
version := "29.2.1-3902be"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jest-diff" % "29.2.1-a95a82",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.2.1-cb67bb",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.2.1-1d957f",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-4e241c",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
