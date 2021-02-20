organization := "org.scalablytyped"
name := "ethersproject__abi"
version := "5.0.0-beta.153-1bc709"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-cae6c9",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-9dd567",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-189e61",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
