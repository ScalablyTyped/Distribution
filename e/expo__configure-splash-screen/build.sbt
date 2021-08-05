organization := "org.scalablytyped"
name := "expo__configure-splash-screen"
version := "0.2.0-b906fa"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color-string" % "1.5-dt-20200515Z-f4f3eb",
  "org.scalablytyped" %%% "commander" % "6.2.0-d7dc02",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "xml-js" % "1.6.11-2d5476")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
