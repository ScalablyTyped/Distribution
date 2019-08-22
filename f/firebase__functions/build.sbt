organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.4.15-b6e316"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.3-14d9c9",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.8-2154bb",
  "org.scalablytyped" %%% "firebase__util" % "0.2.25-637761",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        