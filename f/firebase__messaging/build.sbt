organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.11.0-a58203"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-8ef584",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-120265",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-e12783",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-5011e0",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-898cce",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-4a08fb",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-abe3d7",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
