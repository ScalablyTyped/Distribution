organization := "org.scalablytyped"
name := "firebase__installations"
version := "0.4.0-f2ecce"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.0-cf5c8a",
  "org.scalablytyped" %%% "firebase__component" % "0.1.2-e5feb3",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.0-920db9",
  "org.scalablytyped" %%% "firebase__util" % "0.2.37-3b40cf",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        