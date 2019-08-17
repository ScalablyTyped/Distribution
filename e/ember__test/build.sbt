organization := "org.scalablytyped"
name := "ember__test"
version := "3.0-dt-20190307Z-acc161"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-2dada0",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190213Z-b66a9c",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-58220e",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-6e27a1",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-74605b",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20190405Z-3824d9",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-4b908c",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-2b422f",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-19bece",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2bc54f",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        