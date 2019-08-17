organization := "org.scalablytyped"
name := "ember-mocha"
version := "0.14-dt-20190808Z-3f6ac6"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20190717Z-3c1aef",
  "org.scalablytyped" %%% "ember-test-helpers" % "1.0-dt-20190717Z-6099d6",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-2dada0",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20190213Z-f566a4",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190213Z-b66a9c",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-58220e",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20190213Z-c64d1b",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-6e27a1",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-79865b",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-74605b",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20190301Z-fc734b",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20190405Z-3824d9",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20190724Z-693bd9",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-4b908c",
  "org.scalablytyped" %%% "ember__string" % "3.0-dt-20190307Z-d21be2",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20190307Z-acc161",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20190213Z-6f8d20",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-2b422f",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190530Z-bfe679",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-19bece",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2bc54f",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        