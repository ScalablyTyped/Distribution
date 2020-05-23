organization := "org.scalablytyped"
name := "google-gax"
version := "1.14.2-dbd500"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-1e95bd",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-1a52ea",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.18-4c1f5f",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.4-cbe160",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-5a5680",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "protobufjs" % "6.9.0-eb372e",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
