organization := "org.scalablytyped"
name := "ethereumjs-tx"
version := "2.1.2-036f5f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-f81231",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-2f6b6a",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-6d54f6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "rlp" % "3.0.0-ae3433",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
