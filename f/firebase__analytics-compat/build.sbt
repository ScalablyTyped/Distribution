organization := "org.scalablytyped"
name := "firebase__analytics-compat"
version := "0.1.16-4aa43b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__analytics" % "0.8.3-12608b",
  "org.scalablytyped" %%% "firebase__analytics-types" % "0.7.0-12d9c0",
  "org.scalablytyped" %%% "firebase__app" % "0.8.2-7aa751",
  "org.scalablytyped" %%% "firebase__app-compat" % "0.1.37-656275",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-e8c69b",
  "org.scalablytyped" %%% "firebase__component" % "0.5.20-f485f2",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-947469",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-341bcd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
