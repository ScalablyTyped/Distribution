organization := "org.scalablytyped"
name := "ethers"
version := "5.7.1-96c323"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.7.0-090b2f",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-e80aef",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-74de80",
  "org.scalablytyped" %%% "ethersproject__address" % "5.7.0-40faf1",
  "org.scalablytyped" %%% "ethersproject__basex" % "5.7.0-f99f5f",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-5ea9d0",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-d84c52",
  "org.scalablytyped" %%% "ethersproject__contracts" % "5.7.0-0fc9b7",
  "org.scalablytyped" %%% "ethersproject__hash" % "5.7.0-320ad0",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.7.0-458de6",
  "org.scalablytyped" %%% "ethersproject__json-wallets" % "5.7.0-c0d500",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.7.0-b7a9c9",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-afc521",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-acae2c",
  "org.scalablytyped" %%% "ethersproject__providers" % "5.7.1-6a2925",
  "org.scalablytyped" %%% "ethersproject__sha2" % "5.7.0-8a4bd6",
  "org.scalablytyped" %%% "ethersproject__signing-key" % "5.7.0-3009de",
  "org.scalablytyped" %%% "ethersproject__strings" % "5.7.0-505dce",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-951005",
  "org.scalablytyped" %%% "ethersproject__wallet" % "5.7.0-0325ab",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-15dcb3",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.7.0-7cce3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-54fbe6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
