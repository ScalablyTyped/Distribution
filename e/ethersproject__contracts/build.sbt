organization := "org.scalablytyped"
name := "ethersproject__contracts"
version := "5.0.7-a822ed"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.0.0-beta.153-ea5057",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.0.6-a4ed75",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.0.8-f894df",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-5dacd0",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-930faa",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-c5c319",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-053dce",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-268703",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-c5a73e",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
