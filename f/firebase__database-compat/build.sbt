organization := "org.scalablytyped"
name := "firebase__database-compat"
version := "0.2.10-2bc460"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-b8bdad",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-9a6d1a",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-1b99ae",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-dacf77",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-905454",
  "org.scalablytyped" %%% "firebase__database" % "0.13.10-3c2c8f",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.17-a3b1c7",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-d9a3b0",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-4a44ae",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
