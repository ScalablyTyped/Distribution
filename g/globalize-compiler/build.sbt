organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20190322Z-c2a66f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20190322Z-4b2642",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-79a60f",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20190322Z-75a55c",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        