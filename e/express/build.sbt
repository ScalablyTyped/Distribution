organization := "org.scalablytyped"
name := "express"
version := "4.17-dt-20220913Z-95b486"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-a1e441",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-32fa9f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-99df59",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-b6fd95",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-4b57f5",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
