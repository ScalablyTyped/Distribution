organization := "org.scalablytyped"
name := "ember__test"
version := "3.0-dt-20191126Z-004b76"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200106Z-ccd754",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-e47e87",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-aa4172",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-42c712",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-e7ac47",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191126Z-80f6ed",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-e499a9",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-d29bde",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8d2e4e",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        