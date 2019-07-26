organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.4.6-a6f2ee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.2-097d8c",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.4.4-0e1a21",
  "org.scalablytyped" %%% "firebase__util" % "0.2.22-a0d0a5",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        