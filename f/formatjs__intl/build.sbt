organization := "org.scalablytyped"
name := "formatjs__intl"
version := "2.5.1-f392a9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.13.0-044442",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.10-5cf38b",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.14-f15bc1",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "6.1.4-5f747d",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "7.1.3-b578ab",
  "org.scalablytyped" %%% "intl-messageformat" % "10.2.1-40c6a0",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
