organization := "org.scalablytyped"
name := "ember-data"
version := "3.1-dt-20191003Z-550964"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20191015Z-5780cb",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-1892a0",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20190923Z-b11e15",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190923Z-8d311d",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-57446e",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20191003Z-02d4e5",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-c855ef",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-6621fa",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-b613fb",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20191003Z-4c90d5",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191014Z-8f1128",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20190724Z-76250d",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-d56c72",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20191003Z-108c8f",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20190307Z-558256",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20191003Z-29aa86",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-4b5800",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-c54b03",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8ec6f6",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        