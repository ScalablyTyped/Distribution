organization := "org.scalablytyped"
name := "ethereumjs-vm"
version := "4.2.0-a96a93"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-a32a49",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "ethereumjs-account" % "3.0.0-e37cd4",
  "org.scalablytyped" %%% "ethereumjs-blockchain" % "4.0.4-16d76b",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-ba7041",
  "org.scalablytyped" %%% "ethereumjs-tx" % "2.1.2-4d471f",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-f320f1",
  "org.scalablytyped" %%% "lru-cache" % "7.14.0-0e6613",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "rlp" % "3.0.0-da46e2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
