organization := "org.scalablytyped"
name := "ganache-core"
version := "2.1-dt-20181220Z-be3784"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-69b6a7",
  "org.scalablytyped" %%% "ethereum-protocol" % "1.0-dt-20180612Z-ff6ed6",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        