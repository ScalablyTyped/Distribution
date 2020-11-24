organization := "org.scalablytyped"
name := "ethersproject__abstract-provider"
version := "5.0.6-6bc3d3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-f7bd0b",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-9cfdf9",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-f6d8ba",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-300415",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-edfae2",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-099c66",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
