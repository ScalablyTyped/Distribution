organization := "org.scalablytyped"
name := "ethereumjs-blockchain"
version := "4.0.4-e2fd37"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-ff2541",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-2f6b6a",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-e2d141",
  "org.scalablytyped" %%% "lru-cache" % "7.14.0-c21024",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "rlp" % "3.0.0-ae3433",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
