organization := "org.scalablytyped"
name := "formatjs__intl"
version := "1.4.8-a8ebf1"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-2f3546",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-9e1755",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-088435",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-fabc15",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-abdd0e",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-cfbb96",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
