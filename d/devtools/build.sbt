organization := "org.scalablytyped"
name := "devtools"
version := "7.25.1-e6c2f7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1063652-cd4b27",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-8a2d46",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "puppeteer-core" % "19.2.0-0bad0e",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "wdio__logger" % "7.19.0-f888c4",
  "org.scalablytyped" %%% "wdio__protocols" % "7.22.0-1a1436",
  "org.scalablytyped" %%% "wdio__types" % "7.25.1-847606",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-2ad085")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
