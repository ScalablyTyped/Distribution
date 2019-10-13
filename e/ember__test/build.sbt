organization := "org.scalablytyped"
name := "ember__test"
version := "3.0-dt-20190307Z-96c91c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-25d807",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190923Z-8d311d",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-57446e",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-c855ef",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-b613fb",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20190405Z-0d89c4",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-4b5800",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-c54b03",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8ec6f6",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        