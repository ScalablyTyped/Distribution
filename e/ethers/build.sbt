organization := "org.scalablytyped"
name := "ethers"
version := "5.7.2-79c78e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.7.0-6f1c01",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-86b17a",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-c50a44",
  "org.scalablytyped" %%% "ethersproject__address" % "5.7.0-17c525",
  "org.scalablytyped" %%% "ethersproject__basex" % "5.7.0-70cf52",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-026b38",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-4f8d20",
  "org.scalablytyped" %%% "ethersproject__contracts" % "5.7.0-4187b9",
  "org.scalablytyped" %%% "ethersproject__hash" % "5.7.0-421b18",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.7.0-8bd654",
  "org.scalablytyped" %%% "ethersproject__json-wallets" % "5.7.0-524ec2",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.7.0-b2312e",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-02c7be",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-9d066d",
  "org.scalablytyped" %%% "ethersproject__providers" % "5.7.2-b1dce3",
  "org.scalablytyped" %%% "ethersproject__sha2" % "5.7.0-e63195",
  "org.scalablytyped" %%% "ethersproject__signing-key" % "5.7.0-883816",
  "org.scalablytyped" %%% "ethersproject__strings" % "5.7.0-addb09",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-3ee4ac",
  "org.scalablytyped" %%% "ethersproject__wallet" % "5.7.0-79a87f",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-f277c0",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.7.0-2db8a8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-507aa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
