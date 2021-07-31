organization := "org.scalablytyped"
name := "ethereumjs-vm"
version := "4.2.0-17069a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-33054c",
  "org.scalablytyped" %%% "ethereumjs-account" % "3.0.0-b8fba2",
  "org.scalablytyped" %%% "ethereumjs-blockchain" % "4.0.4-360f56",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-3ba70e",
  "org.scalablytyped" %%% "ethereumjs-tx" % "2.1.2-a4e12f",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.0.7-39ccfb",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20200515Z-7fef5c",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "rlp" % "2.2.6-1fd35d",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
