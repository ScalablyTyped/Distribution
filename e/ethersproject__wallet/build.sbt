organization := "org.scalablytyped"
name := "ethersproject__wallet"
version := "5.0.8-ab6981"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.0.6-2b233e",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.0.8-e8306d",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-b1381a",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-46a269",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.0.6-c583a0",
  "org.scalablytyped" %%% "ethersproject__json-wallets" % "5.0.8-07f24e",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.0.7-7b0b41",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-168eaf",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-ee2e10",
  "org.scalablytyped" %%% "ethersproject__signing-key" % "5.0.6-35b2f2",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-bf4ff1",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-5f0280",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.0.6-81d085",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
