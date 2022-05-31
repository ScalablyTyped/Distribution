organization := "org.scalablytyped"
name := "google-cloud__text-to-speech"
version := "3.1.2-0eeb94"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-10471b",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-2e31d6",
  "org.scalablytyped" %%% "google-gax" % "2.9.2-e71c4f",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.1.8-bbf269",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.5-5965d4",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-103072",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20201002Z-fa90ce",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-f8699f",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
