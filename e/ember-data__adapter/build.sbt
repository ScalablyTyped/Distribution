organization := "org.scalablytyped"
name := "ember-data__adapter"
version := "3.15-dt-20200515Z-fa7e43"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember" % "3.1-dt-20200515Z-f2bf1e",
  "org.scalablytyped" %%% "ember-data" % "3.1-dt-20200515Z-0993d5",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200515Z-69a7bd",
  "org.scalablytyped" %%% "ember__array" % "3.0-dt-20200515Z-f016e6",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20200515Z-b3fe92",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20200328Z-70b5a1",
  "org.scalablytyped" %%% "ember__debug" % "3.0-dt-20200515Z-402b36",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20200515Z-425b06",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20200328Z-4f3de8",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20200515Z-5f3757",
  "org.scalablytyped" %%% "ember__polyfills" % "3.0-dt-20200515Z-adbc85",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20200512Z-bcdf4e",
  "org.scalablytyped" %%% "ember__runloop" % "3.0-dt-20200515Z-cc8f7b",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20200328Z-abc3aa",
  "org.scalablytyped" %%% "ember__template" % "3.0-dt-20200515Z-87126d",
  "org.scalablytyped" %%% "ember__test" % "3.0-dt-20200515Z-a817da",
  "org.scalablytyped" %%% "ember__utils" % "3.0-dt-20200515Z-acbf5d",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200515Z-5d5c16",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20200515Z-d1b4f0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-b4597c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
