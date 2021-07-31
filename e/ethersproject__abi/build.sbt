organization := "org.scalablytyped"
name := "ethersproject__abi"
version := "5.0.0-beta.153-2ae694"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-b1381a",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-46a269",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-ee2e10",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
