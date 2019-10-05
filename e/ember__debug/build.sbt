organization := "org.scalablytyped"
name := "ember__debug"
version := "3.0-dt-20191003Z-621e3a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-8d59dd",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-3fc88f",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-b48117",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        