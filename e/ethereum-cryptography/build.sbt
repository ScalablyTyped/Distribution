organization := "org.scalablytyped"
name := "ethereum-cryptography"
version := "1.1.2-4c022c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "noble__hashes" % "1.1.2-df2eae",
  "org.scalablytyped" %%% "noble__secp256k1" % "1.7.0-e22cf5",
  "org.scalablytyped" %%% "scure__bip32" % "1.1.0-6a9d41",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
