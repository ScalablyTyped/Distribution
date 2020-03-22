organization := "org.scalablytyped"
name := "ember__application"
version := "3.0-dt-20200106Z-4c7783"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-bfa4c7",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20200315Z-22cb9a",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-29f802",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20200225Z-2bba69",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20200225Z-3433dd",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200225Z-e64e66",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20200225Z-c58757",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
