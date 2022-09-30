organization := "org.scalablytyped"
name := "gatsby-page-utils"
version := "2.24.0-faae64"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20211202Z-2f29e4",
  "org.scalablytyped" %%% "micromatch" % "4.0-dt-20220818Z-6f3abb",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
