organization := "org.scalablytyped"
name := "google-gax"
version := "1.7.5-0e85b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.0.1-168bb5",
  "org.scalablytyped" %%% "google-auth-library" % "5.3.0-173d29",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.9-a2f59d",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.3-f3a49d",
  "org.scalablytyped" %%% "gtoken" % "4.1.0-e88fa0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-2c34cf",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        