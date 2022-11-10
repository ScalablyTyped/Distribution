organization := "org.scalablytyped"
name := "egg"
version := "3.3.3-96b336"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-ea3ef3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-c317a9",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-baf750",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-a5f7f1",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20220624Z-3ee8d2",
  "org.scalablytyped" %%% "egg-cookies" % "2.6.1-98b33e",
  "org.scalablytyped" %%% "egg-core" % "4.26.1-2ca449",
  "org.scalablytyped" %%% "egg-logger" % "2.9.0-81027f",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-548241",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-a0340d",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20211202Z-c9ce2b",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "undici" % "5.12.0-7a899f",
  "org.scalablytyped" %%% "urllib" % "3.5.0-dbb545")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
