organization := "org.scalablytyped"
name := "ember-test-helpers"
version := "1.0-dt-20191003Z-2b50ea"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-c1cab0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20191126Z-0701ae",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20191126Z-950295",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-362bff",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-14d81f",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191126Z-a606ea",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-063b55",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-6944c3",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-59dbba",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191126Z-a2c290",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191126Z-d32183",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20191126Z-77ba4a",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-f8581c",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191126Z-40754b",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20191126Z-8d4524",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191126Z-3ea25c",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-13d8c2",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-07db38",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-95a8d0",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        