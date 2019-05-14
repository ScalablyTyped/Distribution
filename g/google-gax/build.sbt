organization := "org.scalablytyped"
name := "google-gax"
version := "0.25.6-75630a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-54aa49",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-7ac8b5",
  "org.scalablytyped" %%% "grpc" % "1.20.2-52b804",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.4.0-133d08",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-0e5e88",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-303c7d",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        