organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.3.23-5f2c29"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.0-367dda",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.1-2eb978",
  "org.scalablytyped" %%% "firebase__component" % "0.1.2-159b27",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.3.8-12d6f8",
  "org.scalablytyped" %%% "firebase__util" % "0.2.37-94372a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        