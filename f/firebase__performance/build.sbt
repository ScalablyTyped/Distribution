organization := "org.scalablytyped"
name := "firebase__performance"
version := "0.2.14-4d55e5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.3-4a4b5f",
  "org.scalablytyped" %%% "firebase__performance-types" % "0.0.3-87f110",
  "org.scalablytyped" %%% "firebase__util" % "0.2.22-f84cf6",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        