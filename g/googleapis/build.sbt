organization := "org.scalablytyped"
name := "googleapis"
version := "39.2.0-8774bd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-10471b",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-2e31d6",
  "org.scalablytyped" %%% "googleapis-common" % "0.7.2-18720a",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-103072",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
