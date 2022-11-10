organization := "org.scalablytyped"
name := "enzyme-react-intl"
version := "2.0-dt-20211202Z-13e975"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-f01dc1",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.13.0-ba168d",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.10-5f6bc8",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.14-3dec36",
  "org.scalablytyped" %%% "formatjs__intl" % "2.5.1-dbd086",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "6.1.4-20ba7b",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "7.1.3-d30c40",
  "org.scalablytyped" %%% "intl-messageformat" % "10.2.1-0a4ec0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-intl" % "6.2.1-67c373",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
