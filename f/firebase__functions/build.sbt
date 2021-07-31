organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.6.1-8a3ad7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-62d0a1",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-f5c274",
  "org.scalablytyped" %%% "firebase__component" % "0.1.21-a8939a",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.4.0-242de4",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-d06cb8",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.5.0-4ece9b",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-555225",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
