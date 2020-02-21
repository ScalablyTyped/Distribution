organization := "org.scalablytyped"
name := "google-gax"
version := "1.7.5-c8c5a3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-975007",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-17684e",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.9-58e784",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.3-70d374",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-a66e0d",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-51815b",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
