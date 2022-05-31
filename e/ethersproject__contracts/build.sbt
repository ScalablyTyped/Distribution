organization := "org.scalablytyped"
name := "ethersproject__contracts"
version := "5.0.7-97f381"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.0.0-beta.153-b5217f",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.0.6-735566",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.0.8-ac025d",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-64e579",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-b21087",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-c5c319",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-05ae41",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-e3e13e",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-594465",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
