organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "1.1.5-7171bb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-0c2e00",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-5c2628",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "1.0.1-5e7456",
  "org.scalablytyped" %%% "google-gax" % "1.7.5-301c22",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.9-1b8c7c",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.3-601932",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-420d70",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-ae878f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-2fcb5d",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-d57d48",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        