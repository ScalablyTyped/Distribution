organization := "org.scalablytyped"
name := "express-winston"
version := "4.2.0-44bcd0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "logform" % "2.4.2-22d522",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "winston" % "3.8.2-208a98",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-af6604")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
