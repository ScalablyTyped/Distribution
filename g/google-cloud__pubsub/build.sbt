organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "1.7.3-231985"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-46e384",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-5f8953",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "1.0.3-5ace40",
  "org.scalablytyped" %%% "google-gax" % "1.14.2-b41401",
  "org.scalablytyped" %%% "grpc__grpc-js" % "0.6.18-595522",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.5.4-daeed1",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-65912d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200515Z-104b3d",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "p-defer" % "3.0.0-6ab831",
  "org.scalablytyped" %%% "protobufjs" % "6.9.0-8bd81a",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
