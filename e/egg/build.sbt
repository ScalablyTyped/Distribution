organization := "org.scalablytyped"
name := "egg"
version := "3.3.3-a77e81"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-f7721a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-5e93f8",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-3b4e14",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-a25e3c",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20220624Z-12cffb",
  "org.scalablytyped" %%% "egg-cookies" % "2.6.1-1204db",
  "org.scalablytyped" %%% "egg-core" % "4.26.1-fde73c",
  "org.scalablytyped" %%% "egg-logger" % "2.9.0-c6ce88",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-eec5d4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-693358",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-fc3ebd",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-37336f",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20211202Z-931162",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-91f487",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "undici" % "5.11.0-fc484f",
  "org.scalablytyped" %%% "urllib" % "3.3.1-e30100")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
