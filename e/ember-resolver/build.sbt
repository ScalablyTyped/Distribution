organization := "org.scalablytyped"
name := "ember-resolver"
version := "5.0-dt-20191003Z-9fae29"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-5afd1f",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20191126Z-a25c3e",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20191126Z-faebe7",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-dcd54b",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-872813",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191126Z-5f69dc",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-464d96",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-40a565",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-bb6b99",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191126Z-a2c290",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20191126Z-8c4e55",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-9afacc",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191126Z-40754b",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191126Z-1f75f1",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-36922a",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-fa0376",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        