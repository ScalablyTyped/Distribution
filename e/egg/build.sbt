organization := "org.scalablytyped"
name := "egg"
version := "3.3.3-5723b5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-6edf5c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-d67c0f",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-baf750",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-a7929e",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20220624Z-47c8e9",
  "org.scalablytyped" %%% "egg-cookies" % "2.6.1-01b39b",
  "org.scalablytyped" %%% "egg-core" % "4.26.1-de7f81",
  "org.scalablytyped" %%% "egg-logger" % "2.9.0-3e13e5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-944d8b",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-0c6b73",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-ff8589",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-a193a1",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20211202Z-d7ec77",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3b575f",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "undici" % "5.12.0-94fc18",
  "org.scalablytyped" %%% "urllib" % "3.5.0-7201a9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
