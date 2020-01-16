organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.4.29-01227c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.0-367dda",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.1-2eb978",
  "org.scalablytyped" %%% "firebase__component" % "0.1.2-159b27",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.3.13-fbd634",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.4.0-ef3e8c",
  "org.scalablytyped" %%% "firebase__util" % "0.2.37-94372a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        