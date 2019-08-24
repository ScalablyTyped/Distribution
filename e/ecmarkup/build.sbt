organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-ad481b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-c95d81",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-19cf6c",
  "org.scalablytyped" %%% "prex" % "0.4.6-8ee380",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        