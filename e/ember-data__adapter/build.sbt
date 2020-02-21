organization := "org.scalablytyped"
name := "ember-data__adapter"
version := "3.15-dt-20200205Z-6bd093"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-a62590",
  "org.scalablytyped" %%% "ember-data" % "3.1-dt-20200205Z-dc29a1",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200106Z-0c68e1",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20191126Z-1b94e3",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-4471ce",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-98b6e9",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191126Z-58723b",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-bef7ff",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-41d62d",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-d9180d",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191126Z-b388cf",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191126Z-b42f35",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20191126Z-9c9ca7",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-55a282",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191126Z-e0873d",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20191126Z-145533",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191126Z-f6c5ba",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200204Z-ce7107",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-ed7e58",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a68146",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
