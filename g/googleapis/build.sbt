organization := "org.scalablytyped"
name := "googleapis"
version := "39.2.0-be00e2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-03b8be",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-07bb56",
  "org.scalablytyped" %%% "googleapis-common" % "0.7.2-cee0a8",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-d03733",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
