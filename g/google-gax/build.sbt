organization := "org.scalablytyped"
name := "google-gax"
version := "1.7.5-bc1754"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-48a679",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-73b209",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.9-5e5b7e",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.3-86a5d6",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-e88fa0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-2c34cf",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        