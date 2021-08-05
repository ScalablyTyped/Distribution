organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.7.3-770432"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-8c5a99",
  "org.scalablytyped" %%% "firebase__component" % "0.1.21-65bd3b",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.4-44dc7e",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-af12fc",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.5.0-027a41",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-4d76ea",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-cf6d2f",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-bf59dd",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
