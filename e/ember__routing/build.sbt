organization := "org.scalablytyped"
name := "ember__routing"
version := "3.0-dt-20200225Z-4ad606"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20200328Z-ad53b9",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20200328Z-638a5c",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20200328Z-dedead",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200415Z-e1b00b",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20200225Z-b4465d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-ca8578",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
