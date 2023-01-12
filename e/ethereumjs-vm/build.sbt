organization := "org.scalablytyped"
name := "ethereumjs-vm"
version := "4.2.0-61a98c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-f7058c",
  "org.scalablytyped" %%% "buffer" % "6.0.3-34b6a7",
  "org.scalablytyped" %%% "ethereumjs-account" % "3.0.0-37c5cb",
  "org.scalablytyped" %%% "ethereumjs-blockchain" % "4.0.4-78d234",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-7d7436",
  "org.scalablytyped" %%% "ethereumjs-tx" % "2.1.2-4a89a3",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-7a18c1",
  "org.scalablytyped" %%% "lru-cache" % "7.14.1-448518",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "rlp" % "3.0.0-389b9d",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
