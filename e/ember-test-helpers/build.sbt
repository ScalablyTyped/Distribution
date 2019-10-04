organization := "org.scalablytyped"
name := "ember-test-helpers"
version := "1.0-dt-20191003Z-c24b77"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191003Z-bc05ba",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-931243",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20190923Z-9dc53e",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190923Z-f31d17",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-7333ad",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191003Z-d2b631",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-1b9edf",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-770fb2",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-062b53",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191003Z-71215d",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20190405Z-2c04e0",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20190724Z-02d429",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-a81d9c",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191003Z-3d1f26",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20190307Z-790c49",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191003Z-2e8029",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-e99267",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-6a41d3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-830e2a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        