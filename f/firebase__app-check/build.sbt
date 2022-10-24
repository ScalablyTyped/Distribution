organization := "org.scalablytyped"
name := "firebase__app-check"
version := "0.5.15-04c6a4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.2-7aa751",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-e8c69b",
  "org.scalablytyped" %%% "firebase__component" % "0.5.20-f485f2",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-947469",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-341bcd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
