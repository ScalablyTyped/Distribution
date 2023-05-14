organization := "org.scalablytyped"
name := "entropy__winston-elasticsearch-apm"
version := "1.0-dt-20211202Z-c74a38"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "elastic-apm-node" % "3.45.0-53da07",
  "org.scalablytyped" %%% "logform" % "2.5.1-81e6b7",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-6b9169")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
