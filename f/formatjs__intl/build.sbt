organization := "org.scalablytyped"
name := "formatjs__intl"
version := "2.4.1-537dc2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.12.0-868421",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.7-cc7c82",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.13-51b3c1",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "6.1.3-d94035",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "7.1.2-c3f8aa",
  "org.scalablytyped" %%% "intl-messageformat" % "10.1.4-c4cc84",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
