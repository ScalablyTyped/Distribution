organization := "org.scalablytyped"
name := "formatjs__intl"
version := "1.4.8-9fa006"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-b1c558",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-614df9",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-ef33a2",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-e9c176",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-ba646b",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-6bafb7",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
