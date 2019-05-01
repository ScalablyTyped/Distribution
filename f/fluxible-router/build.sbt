organization := "org.scalablytyped"
name := "fluxible-router"
version := "1.5-dt-20181009Z-51db27"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "dispatchr" % "1.2-dt-20180425Z-c04463",
  "org.scalablytyped" %%% "fluxible" % "1.4-dt-20181009Z-146d76",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        