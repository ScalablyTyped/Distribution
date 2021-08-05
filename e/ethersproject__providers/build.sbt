organization := "org.scalablytyped"
name := "ethersproject__providers"
version := "5.0.15-40df05"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.0.6-a4ed75",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.0.8-f894df",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-5dacd0",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-930faa",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-c5c319",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-053dce",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-268703",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-c5a73e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-8b3f01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
