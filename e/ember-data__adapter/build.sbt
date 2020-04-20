organization := "org.scalablytyped"
name := "ember-data__adapter"
version := "3.15-dt-20200403Z-d7656c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20200328Z-134ecf",
  "org.scalablytyped" %%% "ember-data" % "3.1-dt-20200328Z-0a924a",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200328Z-ffa58b",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20200328Z-7a62b5",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20200328Z-ad53b9",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20200328Z-638a5c",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20200328Z-4fcbfb",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20200328Z-2cb48a",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20200328Z-a3a04f",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20200328Z-dedead",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20200328Z-b388cf",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20200225Z-4ad606",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20200328Z-5f4182",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20200328Z-a8b4ee",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20200328Z-e0873d",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20200328Z-59af7b",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20200328Z-e634b9",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200415Z-e1b00b",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20200225Z-b4465d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-ca8578",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
