organization := "org.scalablytyped"
name := "expo-location"
version := "9.0.1-3cf2f0"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-0cfe87",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "unimodules-permissions-interface" % "5.3.0-bfc0d2",
  "org.scalablytyped" %%% "unimodules__core" % "5.5.1-5cc9dd",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "5.6.0-682eee")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
