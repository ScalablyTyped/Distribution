organization := "org.scalablytyped"
name := "docker-events"
version := "0.0-dt-20211202Z-8c694c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "docker-modem" % "3.0-dt-20211202Z-ca3282",
  "org.scalablytyped" %%% "dockerode" % "3.3-dt-20221114Z-7c1071",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "ssh2" % "v1.11-dt-20221103Z-9742cb",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
