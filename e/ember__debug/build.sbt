organization := "org.scalablytyped"
name := "ember__debug"
version := "3.0-dt-20191126Z-58723b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20191126Z-bef7ff",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20191126Z-d9180d",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20190717Z-ed7e58",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
