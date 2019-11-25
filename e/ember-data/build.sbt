organization := "org.scalablytyped"
name := "ember-data"
version := "3.1-dt-20191016Z-b52807"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-4c2906",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-b50342",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20190923Z-36fe69",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190923Z-7c4b68",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-266e0b",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191025Z-08f783",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-ee93c7",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-40a565",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-63f068",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191003Z-a2c290",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191014Z-1ad62e",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20190724Z-3277c9",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-f412cc",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191003Z-40754b",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20190307Z-4fbc78",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191003Z-1f75f1",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-72186b",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-fa0376",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        