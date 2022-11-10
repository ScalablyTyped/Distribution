organization := "org.scalablytyped"
name := "ethereumjs-vm"
version := "4.2.0-1dae78"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-7779ac",
  "org.scalablytyped" %%% "buffer" % "6.0.3-bfb740",
  "org.scalablytyped" %%% "ethereumjs-account" % "3.0.0-552292",
  "org.scalablytyped" %%% "ethereumjs-blockchain" % "4.0.4-ec2fe3",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-53a42f",
  "org.scalablytyped" %%% "ethereumjs-tx" % "2.1.2-d87074",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-7ff5d5",
  "org.scalablytyped" %%% "lru-cache" % "7.14.1-63667d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "rlp" % "3.0.0-cac2ac",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
