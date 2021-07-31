organization := "org.scalablytyped"
name := "devtools"
version := "6.9.0-a6b24b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.818844-470229",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-8481b0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "puppeteer-core" % "5.5.0-20ccef",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "wdio__logger" % "6.8.0-86805e",
  "org.scalablytyped" %%% "wdio__protocols" % "6.8.0-41d452",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-518f97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
