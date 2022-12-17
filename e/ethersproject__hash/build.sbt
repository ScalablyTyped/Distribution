organization := "org.scalablytyped"
name := "ethersproject__hash"
version := "5.7.0-eb21ad"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-4e89d4",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-3cbc86",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-f36c73",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-625618",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-c0bd5b",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-092f54",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-1f476e",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-6b190f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
