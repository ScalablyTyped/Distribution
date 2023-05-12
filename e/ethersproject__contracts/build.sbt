organization := "org.scalablytyped"
name := "ethersproject__contracts"
version := "5.7.0-7167d8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.7.0-d04cac",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-39d897",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-7b105e",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-8572ed",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-c50cfb",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-02c7be",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-7d4eac",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-b76f9e",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-7e1817",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
