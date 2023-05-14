organization := "org.scalablytyped"
name := "fs-extra-promise"
version := "1.0-dt-20211202Z-6679d6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20230328Z-ea1cbb",
  "org.scalablytyped" %%% "fs-extra" % "11.0-dt-20230228Z-3b6f4a",
  "org.scalablytyped" %%% "jsonfile" % "6.1-dt-20230108Z-7b95a5",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
