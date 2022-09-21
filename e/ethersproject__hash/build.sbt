organization := "org.scalablytyped"
name := "ethersproject__hash"
version := "5.7.0-33a7d0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-b895a5",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-d4f18a",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-bedb42",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-974392",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-8dafae",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-7ecc05",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-2b2d61",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-034ded",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
