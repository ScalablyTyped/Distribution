organization := "org.scalablytyped"
name := "devexpress-web"
version := "192.3-dt-20191105Z-8e713b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200204Z-ce7107",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190819Z-de4089",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a68146",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
