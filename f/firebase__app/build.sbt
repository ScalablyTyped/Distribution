organization := "org.scalablytyped"
name := "firebase__app"
version := "0.4.26-1174ec"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.7-1748d6",
  "org.scalablytyped" %%% "firebase__component" % "0.1.0-eb98de",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.30-0f7a5f",
  "org.scalablytyped" %%% "firebase__util" % "0.2.33-34219b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        