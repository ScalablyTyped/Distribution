organization := "org.scalablytyped"
name := "ethereumjs-tx"
version := "2.1.2-4a14ee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-4a7dd1",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-2f6b6a",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-bca343",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "rlp" % "3.0.0-ae3433",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
