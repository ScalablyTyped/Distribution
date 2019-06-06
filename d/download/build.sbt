organization := "org.scalablytyped"
name := "download"
version := "6.2-dt-20181231Z-aa6ac4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-daef60",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190426Z-bc74fd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-caf6a1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        