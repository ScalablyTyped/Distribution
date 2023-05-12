organization := "org.scalablytyped"
name := "enzyme-react-intl"
version := "2.0-dt-20221230Z-41bde5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20230415Z-747887",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.15.0-f0663d",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.4.0-181ce4",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.4.0-382448",
  "org.scalablytyped" %%% "formatjs__intl" % "2.7.2-b45a74",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "6.3.2-c453f6",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "7.2.2-01ec56",
  "org.scalablytyped" %%% "intl-messageformat" % "10.3.5-544269",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-intl" % "6.4.2-a3c8fa",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
