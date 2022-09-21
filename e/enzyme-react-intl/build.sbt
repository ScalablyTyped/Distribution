organization := "org.scalablytyped"
name := "enzyme-react-intl"
version := "2.0-dt-20211202Z-168a68"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-04f4a7",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.12.0-868421",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.7-cc7c82",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.13-51b3c1",
  "org.scalablytyped" %%% "formatjs__intl" % "2.4.1-537dc2",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "6.1.3-d94035",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "7.1.2-c3f8aa",
  "org.scalablytyped" %%% "intl-messageformat" % "10.1.4-c4cc84",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-intl" % "6.1.1-4cc514",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
