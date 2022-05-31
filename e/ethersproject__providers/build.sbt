organization := "org.scalablytyped"
name := "ethersproject__providers"
version := "5.0.15-b77615"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.0.6-735566",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.0.8-ac025d",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-64e579",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-b21087",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-c5c319",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-05ae41",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-e3e13e",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-594465",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9be819")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
