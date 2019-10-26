organization := "org.scalablytyped"
name := "ember__debug"
version := "3.0-dt-20191025Z-0b8b38"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-c855ef",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-b613fb",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-c54b03",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        