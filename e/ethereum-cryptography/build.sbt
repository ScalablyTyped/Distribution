organization := "org.scalablytyped"
name := "ethereum-cryptography"
version := "1.1.2-8d0c43"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "noble__hashes" % "1.1.2-6376d4",
  "org.scalablytyped" %%% "noble__secp256k1" % "1.7.0-505b7d",
  "org.scalablytyped" %%% "scure__bip32" % "1.1.0-fb66df",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
