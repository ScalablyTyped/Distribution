organization := "org.scalablytyped"
name := "ethereum-cryptography"
version := "1.1.2-c0fe40"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "noble__hashes" % "1.1.2-aba1b4",
  "org.scalablytyped" %%% "noble__secp256k1" % "1.7.0-1a0058",
  "org.scalablytyped" %%% "scure__bip32" % "1.1.0-6ab32c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
