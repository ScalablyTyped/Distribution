organization := "org.scalablytyped"
name := "ethersproject__providers"
version := "5.7.2-ebf8c8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-701210",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-bbe582",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-e1ffa6",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-6c5f4d",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-5d0f32",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-b849d8",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-c4dafb",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-7bd670",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-20cc7d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
