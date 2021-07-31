organization := "org.scalablytyped"
name := "enzyme-react-intl"
version := "2.0-dt-20201116Z-36ded1"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-2e8b87",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-534c7d",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-b1c558",
  "org.scalablytyped" %%% "formatjs__intl" % "1.4.8-9fa006",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-614df9",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-ef33a2",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-e9c176",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-ba646b",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-6bafb7",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-intl" % "5.10.4-e15f0d",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
