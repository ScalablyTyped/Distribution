organization := "org.scalablytyped"
name := "encoding-down"
version := "5.0-dt-20200515Z-01e3c5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-de56b6",
  "org.scalablytyped" %%% "level-codec" % "9.0-dt-20200515Z-7b8796",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
