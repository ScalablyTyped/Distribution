organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-16d22f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.6-1291cd",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.6-e08eed",
  "org.scalablytyped" %%% "prex" % "0.4.6-fcc97d",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        