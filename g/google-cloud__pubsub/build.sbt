organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "1.5.0-c1bdb8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-975007",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-17684e",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "1.0.3-12d624",
  "org.scalablytyped" %%% "google-gax" % "1.7.5-c8c5a3",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.9-58e784",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.3-70d374",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-a66e0d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200122Z-5ea517",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-305f00",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-51815b",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
