organization := "org.scalablytyped"
name := "google-cloud__tasks"
version := "0.2-dt-20200925Z-1c7f05"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "4.0.1-03b8be",
  "org.scalablytyped" %%% "google-auth-library" % "6.1.3-07bb56",
  "org.scalablytyped" %%% "google-gax" % "2.9.2-06f41e",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.1.8-2716d8",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.5-336ba7",
  "org.scalablytyped" %%% "gtoken" % "5.1.0-d03733",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-cbfb36",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
