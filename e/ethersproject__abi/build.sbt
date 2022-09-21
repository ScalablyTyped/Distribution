organization := "org.scalablytyped"
name := "ethersproject__abi"
version := "5.7.0-39922a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-bedb42",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-974392",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-7ecc05",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
