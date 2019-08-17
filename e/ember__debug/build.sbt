organization := "org.scalablytyped"
name := "ember__debug"
version := "3.0-dt-20190213Z-c64d1b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-6e27a1",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-74605b",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-19bece",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        