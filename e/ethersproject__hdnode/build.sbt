organization := "org.scalablytyped"
name := "ethersproject__hdnode"
version := "5.7.0-8bd654"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-86b17a",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-c50a44",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-026b38",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-4f8d20",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.7.0-b2312e",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-02c7be",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-9d066d",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-3ee4ac",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-f277c0",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.7.0-2db8a8",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
