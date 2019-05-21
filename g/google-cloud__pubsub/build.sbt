organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "0.28.1-9df2cf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-54faae",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-e5193b",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "0.1.0-54e0fe",
  "org.scalablytyped" %%% "google-gax" % "0.25.6-ea370b",
  "org.scalablytyped" %%% "grpc" % "1.20.2-509871",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.4.0-d96a81",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-0e5e88",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-186391",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "p-defer" % "2.1.0-82d9e4",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-2c1544",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        