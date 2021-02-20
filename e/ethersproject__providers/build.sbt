organization := "org.scalablytyped"
name := "ethersproject__providers"
version := "5.0.15-c68cf2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.0.6-62e5be",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.0.8-53f48a",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-cae6c9",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-9dd567",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-39ff95",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-189e61",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-c5a425",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-7279e8",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9df179")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
