organization := "org.scalablytyped"
name := "express-status-monitor"
version := "1.3-dt-20220521Z-721a7b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-3b2b8e",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-af81e9",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-78b511",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.2-16cd71",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-6db76f",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-806962",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-2698ce",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
