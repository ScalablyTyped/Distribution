organization := "org.scalablytyped"
name := "download"
version := "6.2-dt-20181231Z-6302df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-5e90df",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190426Z-d68815",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-2b35e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        