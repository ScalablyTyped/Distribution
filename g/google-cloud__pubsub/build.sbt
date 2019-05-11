organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "0.28.1-4e8270"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-61465f",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-7a7170",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "0.1.0-54e0fe",
  "org.scalablytyped" %%% "google-gax" % "0.25.6-31d5ad",
  "org.scalablytyped" %%% "grpc" % "1.20.2-d6e12a",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.4.0-6f43a3",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-0e5e88",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-186391",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "p-defer" % "2.1.0-82d9e4",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-303c7d",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        