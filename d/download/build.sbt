organization := "org.scalablytyped"
name := "download"
version := "6.2-dt-20181231Z-90ca39"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-0e49f3",
  "org.scalablytyped" %%% "got" % "9.6-dt-20190617Z-0c8a2a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-addd8b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        