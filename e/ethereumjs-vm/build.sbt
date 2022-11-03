organization := "org.scalablytyped"
name := "ethereumjs-vm"
version := "4.2.0-45e0c2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-509689",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "ethereumjs-account" % "3.0.0-50a396",
  "org.scalablytyped" %%% "ethereumjs-blockchain" % "4.0.4-dd464d",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-2f6b6a",
  "org.scalablytyped" %%% "ethereumjs-tx" % "2.1.2-aa3af7",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-cb605b",
  "org.scalablytyped" %%% "lru-cache" % "7.14.1-5473ac",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "rlp" % "3.0.0-ae3433",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
