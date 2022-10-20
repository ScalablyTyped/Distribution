organization := "org.scalablytyped"
name := "ethereumjs-vm"
version := "4.2.0-465906"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-6fd3d1",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "ethereumjs-account" % "3.0.0-01b402",
  "org.scalablytyped" %%% "ethereumjs-blockchain" % "4.0.4-107808",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-ba7041",
  "org.scalablytyped" %%% "ethereumjs-tx" % "2.1.2-c0e822",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-26078c",
  "org.scalablytyped" %%% "lru-cache" % "7.14.0-0e6613",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "rlp" % "3.0.0-da46e2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
