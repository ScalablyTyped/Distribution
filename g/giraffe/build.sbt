organization := "org.scalablytyped"
name := "giraffe"
version := "0.0-unknown-dt-20190619Z-00a369"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-149f86",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190624Z-9b43ed",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-29a319",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190701Z-4565cc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        