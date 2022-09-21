organization := "org.scalablytyped"
name := "ethereumjs-tx"
version := "2.1.2-454a45"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-bda688",
  "org.scalablytyped" %%% "buffer" % "6.0.3-1325ca",
  "org.scalablytyped" %%% "ethereumjs-common" % "1.5.2-cb4f99",
  "org.scalablytyped" %%% "ethereumjs-util" % "7.1.5-9b02df",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "rlp" % "3.0.0-5fc989",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
