organization := "org.scalablytyped"
name := "ethersproject__providers"
version := "5.7.2-aebaa2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-7a72b4",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-6ecabe",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-29fffe",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-5bf7d7",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-c0bd5b",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-b44b67",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-4ee716",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-251482",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
