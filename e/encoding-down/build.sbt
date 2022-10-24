organization := "org.scalablytyped"
name := "encoding-down"
version := "5.0-dt-20211202Z-1a5609"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "7.2-dt-20220329Z-08c022",
  "org.scalablytyped" %%% "level-codec" % "9.0-dt-20211202Z-c490f9",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
