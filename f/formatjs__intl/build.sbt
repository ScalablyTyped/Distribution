organization := "org.scalablytyped"
name := "formatjs__intl"
version := "2.5.1-a6f7d7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.13.0-c607c6",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.10-ae40f0",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.14-561379",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "6.1.4-fd8dc9",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "7.1.3-d722e7",
  "org.scalablytyped" %%% "intl-messageformat" % "10.2.1-8adf31",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
