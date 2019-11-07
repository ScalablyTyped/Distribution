organization := "org.scalablytyped"
name := "ember__test"
version := "3.0-dt-20190307Z-f92db9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20190301Z-55fd87",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190923Z-0576d6",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-26e8b3",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-aaa02c",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-3e04f9",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20191014Z-8b580f",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-17006e",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-010e6d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a5fece",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        