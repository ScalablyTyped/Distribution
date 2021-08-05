organization := "org.scalablytyped"
name := "ethereumjs-blockchain"
version := "4.0.4-bc624f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-919a86",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-bfe68f",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.0.7-6e9548",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20200515Z-86250f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "rlp" % "2.2.6-f43b0b",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
