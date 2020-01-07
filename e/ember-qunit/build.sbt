organization := "org.scalablytyped"
name := "ember-qunit"
version := "3.4-dt-20191003Z-dff7bd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-6b594e",
  "org.scalablytyped" %%% "ember-test-helpers" % "1.0-dt-20191003Z-3887e8",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200106Z-572079",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20191126Z-733266",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-ef3b62",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-93c2ae",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191126Z-19d1e2",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-5973fc",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-d9c636",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-709fc7",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191126Z-a2c290",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191126Z-db9e55",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20191126Z-f63c52",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-7b833d",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191126Z-40754b",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20191126Z-9a9694",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191126Z-658517",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-d6bfbf",
  "org.scalablytyped" %%% "qunit" % "v2.9.2-dt-20190429Z-9b431d",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-13b6f0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a9f7cc",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        