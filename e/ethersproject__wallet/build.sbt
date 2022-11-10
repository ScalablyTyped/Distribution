organization := "org.scalablytyped"
name := "ethersproject__wallet"
version := "5.7.0-15f9e6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-3d4370",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-c4fb68",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-0de90b",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-8ff2ff",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.7.0-0c0c04",
  "org.scalablytyped" %%% "ethersproject__json-wallets" % "5.7.0-90e21e",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.7.0-6ce3a0",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-5d0f32",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-911374",
  "org.scalablytyped" %%% "ethersproject__signing-key" % "5.7.0-07a593",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-0edfc2",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-7fa544",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.7.0-52ba8f",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
