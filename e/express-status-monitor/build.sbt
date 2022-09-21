organization := "org.scalablytyped"
name := "express-status-monitor"
version := "1.3-dt-20220521Z-a4ed7c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-e65c64",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-fb5eed",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-b5b88b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-6f01fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-c34bb1",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-21c0d6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-11838a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-77d826",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.2-997d6d",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-62c5ea",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-bfd427",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-a5c1c6",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
