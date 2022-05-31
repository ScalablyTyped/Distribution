organization := "org.scalablytyped"
name := "firebase__auth-types"
version := "0.10.1-28cb22"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-680562",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-fc6b40",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-06d2d6",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
