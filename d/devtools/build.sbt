organization := "org.scalablytyped"
name := "devtools"
version := "6.9.0-d5d4a0"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.818844-f06cd7",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-18e3de",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "puppeteer-core" % "5.5.0-c95f2d",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "wdio__logger" % "6.8.0-d9cbeb",
  "org.scalablytyped" %%% "wdio__protocols" % "6.8.0-ffb7d8",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9be819")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
