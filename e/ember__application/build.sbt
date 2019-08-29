organization := "org.scalablytyped"
name := "ember__application"
version := "3.0-dt-20190301Z-1b8104"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20190213Z-f31d17",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-7333ad",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20190213Z-1b9edf",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20190611Z-062b53",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20190405Z-9c5546",
  "org.scalablytyped" %%% "ember__service" % "3.0-dt-20190503Z-a81d9c",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-e99267",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-6a41d3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-830e2a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        