organization := "org.scalablytyped"
name := "ethers"
version := "5.7.2-6bad11"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.7.0-04b8c5",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-4e89d4",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-3cbc86",
  "org.scalablytyped" %%% "ethersproject__address" % "5.7.0-ce76ef",
  "org.scalablytyped" %%% "ethersproject__basex" % "5.7.0-613ef1",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-f36c73",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-625618",
  "org.scalablytyped" %%% "ethersproject__contracts" % "5.7.0-eeb9e7",
  "org.scalablytyped" %%% "ethersproject__hash" % "5.7.0-eb21ad",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.7.0-120007",
  "org.scalablytyped" %%% "ethersproject__json-wallets" % "5.7.0-90dba1",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.7.0-35052c",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-c0bd5b",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-092f54",
  "org.scalablytyped" %%% "ethersproject__providers" % "5.7.2-d06f03",
  "org.scalablytyped" %%% "ethersproject__sha2" % "5.7.0-090878",
  "org.scalablytyped" %%% "ethersproject__signing-key" % "5.7.0-2a40fe",
  "org.scalablytyped" %%% "ethersproject__strings" % "5.7.0-b99b74",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-1f476e",
  "org.scalablytyped" %%% "ethersproject__wallet" % "5.7.0-b7f6a2",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-6b190f",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.7.0-0925cb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
