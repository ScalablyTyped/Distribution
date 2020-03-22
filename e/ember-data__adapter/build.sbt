organization := "org.scalablytyped"
name := "ember-data__adapter"
version := "3.15-dt-20200205Z-58f55e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-8e59f5",
  "org.scalablytyped" %%% "ember-data" % "3.1-dt-20200205Z-095c0c",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200106Z-b7e0fe",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20191126Z-93bd53",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-fbe6f5",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-a7aa14",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191126Z-7a3d64",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-d25263",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-d80471",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-c78d90",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191126Z-b388cf",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191126Z-f55501",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20191126Z-8dec1d",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-875ea1",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191126Z-e0873d",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20191126Z-5862bc",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191126Z-dad5f7",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200204Z-2d3992",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-c58757",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
