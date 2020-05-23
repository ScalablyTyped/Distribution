organization := "org.scalablytyped"
name := "ember__test"
version := "3.0-dt-20200515Z-a817da"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200515Z-69a7bd",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20200515Z-b3fe92",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20200328Z-70b5a1",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20200515Z-425b06",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20200515Z-5f3757",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20200512Z-bcdf4e",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200515Z-5d5c16",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20200515Z-d1b4f0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-b4597c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
