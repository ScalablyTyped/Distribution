organization := "org.scalablytyped"
name := "firebase__analytics"
version := "0.2.10-005743"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__analytics-types" % "0.2.5-c555b7",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.0-367dda",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.2.4-726b9f",
  "org.scalablytyped" %%% "firebase__util" % "0.2.37-94372a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        