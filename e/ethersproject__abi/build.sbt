organization := "org.scalablytyped"
name := "ethersproject__abi"
version := "5.0.0-beta.153-0b25d0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.2-e90204",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.1-b1227c",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.1-7cbcc9",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
