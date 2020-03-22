organization := "org.scalablytyped"
name := "ember-mocha"
version := "0.14-dt-20200227Z-7478ef"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20200225Z-b649d0",
  "org.scalablytyped" %%% "ember-test-helpers" % "1.0-dt-20200227Z-d4bf1f",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200106Z-4c7783",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20191126Z-b9af08",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-bfa4c7",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20200315Z-22cb9a",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191126Z-c56d0c",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-29f802",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-d80471",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20200225Z-2bba69",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191126Z-b388cf",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20200225Z-3433dd",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20191126Z-8dec1d",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-d9f77e",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191126Z-e0873d",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20191126Z-7c16a0",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20200225Z-dad5f7",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200225Z-e64e66",
  "org.scalablytyped" %%% "mocha" % "7.0-dt-20200303Z-eab6e1",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20200225Z-c58757",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
