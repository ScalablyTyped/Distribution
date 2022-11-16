organization := "org.scalablytyped"
name := "devtools"
version := "7.26.0-214734"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-46fecc",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1070637-4b8002",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-c810c5",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "puppeteer-core" % "19.2.2-d79013",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "typescript" % "4.9.3-1dab2c",
  "org.scalablytyped" %%% "wdio__logger" % "7.26.0-c0ef0a",
  "org.scalablytyped" %%% "wdio__protocols" % "7.22.0-84ad47",
  "org.scalablytyped" %%% "wdio__types" % "7.26.0-5c0dea",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
