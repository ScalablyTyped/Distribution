organization := "org.scalablytyped"
name := "ember__test-helpers"
version := "0.7-dt-20191003Z-6db4ee"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20191126Z-572079",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-ef3b62",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-93c2ae",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-5973fc",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20190213Z-d9c636",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-709fc7",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191126Z-db9e55",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-d6bfbf",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-13b6f0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a9f7cc",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        