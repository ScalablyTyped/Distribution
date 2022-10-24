organization := "org.scalablytyped"
name := "ethersproject__abi"
version := "5.7.0-0bd149"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-e1ffa6",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-6c5f4d",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-b849d8",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
