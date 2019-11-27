organization := "org.scalablytyped"
name := "ember__test-helpers"
version := "0.7-dt-20191003Z-e9aae1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20191126Z-a25c3e",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-464d96",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-40a565",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        