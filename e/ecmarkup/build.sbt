organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-d7a071"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-e1656d",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-651d36",
  "org.scalablytyped" %%% "prex" % "0.4.6-d35eee",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        