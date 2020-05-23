organization := "org.scalablytyped"
name := "ethersproject__abi"
version := "5.0.0-beta.153-222c27"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.0-beta.139-f0d8d1",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.0-beta.138-f91d99",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.0-beta.141-b3162f",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
