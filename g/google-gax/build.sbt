organization := "org.scalablytyped"
name := "google-gax"
version := "1.7.5-ba6cab"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-becc6d",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-f09f6e",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.9-60ead5",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.3-637259",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-420d70",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-d57d48",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        