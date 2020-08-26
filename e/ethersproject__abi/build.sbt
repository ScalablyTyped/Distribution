organization := "org.scalablytyped"
name := "ethersproject__abi"
version := "5.0.0-beta.153-ba155a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.5-c2da25",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.3-9d6dcc",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.2-ff9e8d",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
