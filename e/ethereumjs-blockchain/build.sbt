organization := "org.scalablytyped"
name := "ethereumjs-blockchain"
version := "4.0.4-fd2f6f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-eae40c",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-9d19cf",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.0.7-64bcb6",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20200515Z-4653a2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "rlp" % "2.2.6-e6ddc4",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
