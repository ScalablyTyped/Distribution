organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.8.0-49a953"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.7-1748d6",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.8.0-31d043",
  "org.scalablytyped" %%% "firebase__util" % "0.2.33-34219b",
  "org.scalablytyped" %%% "grpc" % "1.21.1-6358a8",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-1047c6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        