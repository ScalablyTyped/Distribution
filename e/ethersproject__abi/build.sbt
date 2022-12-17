organization := "org.scalablytyped"
name := "ethersproject__abi"
version := "5.7.0-04b8c5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-f36c73",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-625618",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-092f54",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
