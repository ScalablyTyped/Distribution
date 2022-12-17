organization := "org.scalablytyped"
name := "ethereumjs-tx"
version := "2.1.2-7b6036"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-a01ba4",
  "org.scalablytyped" %%% "buffer" % "6.0.3-053422",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-3851f4",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-927364",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rlp" % "3.0.0-1cf295",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
