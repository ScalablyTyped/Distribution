organization := "org.scalablytyped"
name := "firebase__firestore"
version := "1.4.12-0f7bf6"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.3-d24fa6",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.4.4-9ad9c1",
  "org.scalablytyped" %%% "firebase__util" % "0.2.25-2c8052",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        