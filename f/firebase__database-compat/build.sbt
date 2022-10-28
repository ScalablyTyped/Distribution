organization := "org.scalablytyped"
name := "firebase__database-compat"
version := "0.2.10-063fbd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.3-0f86ba",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-e847c1",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-6f6d8a",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-732ba6",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-2f926f",
  "org.scalablytyped" %%% "firebase__database" % "0.13.10-5f71e4",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.17-db3818",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-2113bf",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-d8aaca",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
