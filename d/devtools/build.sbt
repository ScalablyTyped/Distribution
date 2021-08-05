organization := "org.scalablytyped"
name := "devtools"
version := "6.9.0-772b12"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.818844-e67d3d",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-18e3de",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "puppeteer-core" % "5.5.0-4e6943",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "wdio__logger" % "6.8.0-7caa52",
  "org.scalablytyped" %%% "wdio__protocols" % "6.8.0-f1822d",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-8b3f01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
