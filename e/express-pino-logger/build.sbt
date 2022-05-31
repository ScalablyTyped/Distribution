organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-178b7f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "pino" % "6.3-dt-20201119Z-6e5605",
  "org.scalablytyped" %%% "pino-http" % "5.0-dt-20200826Z-a4c13b",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20200515Z-8133cb",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-788966",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
