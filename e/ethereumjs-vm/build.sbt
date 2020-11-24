organization := "org.scalablytyped"
name := "ethereumjs-vm"
version := "4.2.0-e6878e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-a08c0a",
  "org.scalablytyped" %%% "ethereumjs-account" % "3.0.0-27804a",
  "org.scalablytyped" %%% "ethereumjs-blockchain" % "4.0.4-bba73a",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-d7a2a3",
  "org.scalablytyped" %%% "ethereumjs-tx" % "2.1.2-f38f0a",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.0.7-8d37c3",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20200515Z-61b8b1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "rlp" % "2.2.6-047988",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
