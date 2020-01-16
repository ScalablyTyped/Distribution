organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.9.2-e6003a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.0-367dda",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.1-2eb978",
  "org.scalablytyped" %%% "firebase__component" % "0.1.2-159b27",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.9.0-e04567",
  "org.scalablytyped" %%% "firebase__util" % "0.2.37-94372a",
  "org.scalablytyped" %%% "grpc" % "1.21.1-fb81fc",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-2c34cf",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        