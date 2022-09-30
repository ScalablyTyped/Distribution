organization := "org.scalablytyped"
name := "ethersproject__hdnode"
version := "5.7.0-610a92"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-cdf6ed",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-be5cd8",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-059bb2",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-3b012a",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.7.0-549b98",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-8dafae",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-67ecdd",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-618f76",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-bc248c",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.7.0-e242b7",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
