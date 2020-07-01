organization := "org.scalablytyped"
name := "ember__test"
version := "3.16-dt-20200610Z-45119f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.16-dt-20200610Z-28a6e7",
  "org.scalablytyped" %%% "ember__component" % "3.16-dt-20200610Z-a1479e",
  "org.scalablytyped" %%% "ember__controller" % "3.16-dt-20200610Z-1c7686",
  "org.scalablytyped" %%% "ember__engine" % "3.16-dt-20200610Z-3ab743",
  "org.scalablytyped" %%% "ember__object" % "3.12-dt-20200610Z-651e21",
  "org.scalablytyped" %%% "ember__routing" % "3.16-dt-20200617Z-21259b",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-33c88a",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20200515Z-82f757",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-775559",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
