organization := "org.scalablytyped"
name := "durandal"
version := "2.1.0-dt-20190322Z-2fac9c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-219526",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190515Z-601f59",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e29cf7",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        