organization := "org.scalablytyped"
name := "ember-data"
version := "3.1-dt-20191016Z-9ecc2c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-e25668",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-55fd87",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20190923Z-3ff791",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190923Z-0576d6",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-26e8b3",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191025Z-30f54c",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-aaa02c",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-6e0034",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-3e04f9",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191003Z-4c90d5",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191014Z-8b580f",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20190724Z-08301b",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-698201",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191003Z-108c8f",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20190307Z-f92db9",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191003Z-d34077",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-17006e",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-010e6d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a5fece",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        