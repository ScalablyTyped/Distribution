organization := "org.scalablytyped"
name := "ethersproject__contracts"
version := "5.7.0-0fc9b7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.7.0-090b2f",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-e80aef",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-74de80",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-5ea9d0",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-d84c52",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-afc521",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-acae2c",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-951005",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-15dcb3",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
