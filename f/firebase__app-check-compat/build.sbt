organization := "org.scalablytyped"
name := "firebase__app-check-compat"
version := "0.2.16-4a7104"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.3-17b6e3",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.16-581aac",
  "org.scalablytyped" %%% "firebase__app-check-types" % "0.4.1-e37532",
  "org.scalablytyped" %%% "firebase__app-compat" % "0.1.38-6a30a7",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-1b99ae",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-905454",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-d9a3b0",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-4a44ae",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
