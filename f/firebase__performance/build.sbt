organization := "org.scalablytyped"
name := "firebase__performance"
version := "0.2.26-2e59df"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.7-1748d6",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.30-0f7a5f",
  "org.scalablytyped" %%% "firebase__performance-types" % "0.0.6-ad7fea",
  "org.scalablytyped" %%% "firebase__util" % "0.2.33-34219b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        