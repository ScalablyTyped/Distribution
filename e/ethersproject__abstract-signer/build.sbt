organization := "org.scalablytyped"
name := "ethersproject__abstract-signer"
version := "5.7.0-6ecabe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-7a72b4",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-29fffe",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-5bf7d7",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-c0bd5b",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-b44b67",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-4ee716",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-251482",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
