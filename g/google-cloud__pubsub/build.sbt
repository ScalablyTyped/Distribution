organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "1.3.0-8cefda"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-1c8aa6",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-54e5df",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "1.0.3-525214",
  "org.scalablytyped" %%% "google-gax" % "1.7.5-08abed",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.9-a8391b",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.3-0907b6",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-f1e932",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-6241aa",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-5ef1a2",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-d8aa30",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        