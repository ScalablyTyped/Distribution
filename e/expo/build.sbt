organization := "org.scalablytyped"
name := "expo"
version := "32.0-dt-20190502Z-a635d1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-f77867",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-97e7d2",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190701Z-836108",
  "org.scalablytyped" %%% "react-native-maps" % "0.24-dt-20190519Z-3b6d22",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.1-c9efe0",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        