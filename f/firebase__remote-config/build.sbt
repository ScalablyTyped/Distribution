organization := "org.scalablytyped"
name := "firebase__remote-config"
version := "0.1.2-3c5d7c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.6-f41544",
  "org.scalablytyped" %%% "firebase__remote-config-types" % "0.1.2-a6e8ee",
  "org.scalablytyped" %%% "firebase__util" % "0.2.30-f52a43",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        