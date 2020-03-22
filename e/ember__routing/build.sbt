organization := "org.scalablytyped"
name := "ember__routing"
version := "3.0-dt-20191126Z-f55501"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20191126Z-fbe6f5",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20190503Z-a7aa14",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-c78d90",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200204Z-2d3992",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-c58757",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
