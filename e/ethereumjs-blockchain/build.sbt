organization := "org.scalablytyped"
name := "ethereumjs-blockchain"
version := "4.0.4-3682b0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-492205",
  "org.scalablytyped" %%% "buffer" % "6.0.3-61ce95",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-cc3a40",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-fc1b8f",
  "org.scalablytyped" %%% "lru-cache" % "7.14.1-a42cef",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "rlp" % "3.0.0-51657e",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
