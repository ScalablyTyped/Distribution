organization := "org.scalablytyped"
name := "express-pino-logger"
version := "4.0-dt-20211202Z-2434dd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "pino" % "8.6.1-db7929",
  "org.scalablytyped" %%% "pino-http" % "5.8-dt-20211202Z-8574de",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-4bafa0",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-fdfc4d",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-fb4c83",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
