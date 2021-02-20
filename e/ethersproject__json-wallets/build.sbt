organization := "org.scalablytyped"
name := "ethersproject__json-wallets"
version := "5.0.8-e13700"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.0.6-62e5be",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.0.8-53f48a",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-cae6c9",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-9dd567",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.0.6-912e2d",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.0.7-21d1c1",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-39ff95",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-189e61",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-c5a425",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-7279e8",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.0.6-46ae0a",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
