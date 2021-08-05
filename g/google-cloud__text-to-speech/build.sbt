organization := "org.scalablytyped"
name := "google-cloud__text-to-speech"
version := "3.1.2-a035a4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-42c99c",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-d0f312",
  "org.scalablytyped" %%% "google-gax" % "2.9.2-ba6839",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.1.8-f21fd8",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.5-2d9c0f",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-322bb1",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20201002Z-a49fd3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-f9a9f4",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
