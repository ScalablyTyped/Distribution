organization := "org.scalablytyped"
name := "ember-qunit"
version := "3.4-dt-20191003Z-045aa7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-622fbc",
  "org.scalablytyped" %%% "ember-test-helpers" % "1.0-dt-20191003Z-8b9268",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20191126Z-c139e8",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20191126Z-f325d2",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-344750",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-16b230",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191126Z-09649f",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-7639ec",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-40a565",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-63f068",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191126Z-a2c290",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191126Z-a01c77",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20191126Z-3277c9",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-640ae3",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191126Z-40754b",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20191126Z-0c0c96",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191126Z-1f75f1",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-72186b",
  "org.scalablytyped" %%% "qunit" % "v2.9.2-dt-20190429Z-ba32e9",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-fa0376",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        