organization := "org.scalablytyped"
name := "ethereumjs-blockchain"
version := "4.0.4-95c336"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-c652d8",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-df68f2",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.0.7-ba0671",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20200515Z-054366",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "rlp" % "2.2.6-c509c4",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
