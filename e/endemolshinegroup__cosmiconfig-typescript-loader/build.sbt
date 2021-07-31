organization := "org.scalablytyped"
name := "endemolshinegroup__cosmiconfig-typescript-loader"
version := "3.0.2-a2afa6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cosmiconfig" % "7.0.0-8c10e4",
  "org.scalablytyped" %%% "make-error" % "1.3.6-ce92d0",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
