organization := "org.scalablytyped"
name := "formatjs__intl"
version := "1.4.8-87220d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-290737",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-12a95c",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-ee6207",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-f9c3a4",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-93be06",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-8e932b",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
