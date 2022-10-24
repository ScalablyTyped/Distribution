organization := "org.scalablytyped"
name := "firebase__analytics-types"
version := "0.7.0-12d9c0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-e8c69b",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-947469",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-341bcd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
