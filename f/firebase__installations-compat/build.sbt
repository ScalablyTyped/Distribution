organization := "org.scalablytyped"
name := "firebase__installations-compat"
version := "0.2.4-1ab51b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.9.13-0d6d5a",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-43a1d7",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-f3258e",
  "org.scalablytyped" %%% "firebase__installations" % "0.6.4-6a601b",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.5.0-aa44d3",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-7842bf",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-845e71",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
