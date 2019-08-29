organization := "org.scalablytyped"
name := "ember-testing-helpers"
version := "0.0-unknown-dt-20190322Z-3e525a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-e99267",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-6a41d3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-830e2a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        