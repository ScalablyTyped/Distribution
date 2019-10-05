organization := "org.scalablytyped"
name := "ember"
version := "3.1-dt-20191003Z-fb3f0f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-ecdbce",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20190923Z-b367fb",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190923Z-5ada10",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-ce5741",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191003Z-621e3a",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-8d59dd",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-47d9c4",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-3fc88f",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191003Z-4c90d5",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20190405Z-6041f1",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20190724Z-55a723",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-f54b73",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191003Z-108c8f",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20190307Z-929dcf",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191003Z-37dbc5",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-f791ad",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-b48117",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-77de40",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        