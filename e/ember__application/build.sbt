organization := "org.scalablytyped"
name := "ember__application"
version := "3.0-dt-20191126Z-0701ae"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-362bff",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-14d81f",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-063b55",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-59dbba",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191126Z-d32183",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-13d8c2",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-07db38",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-95a8d0",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        