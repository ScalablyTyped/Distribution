organization := "org.scalablytyped"
name := "expo"
version := "32.0-dt-20190502Z-76bd86"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-f77867",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190619Z-8d8143",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-27d7d1",
  "org.scalablytyped" %%% "react-native-maps" % "0.24-dt-20190519Z-6329a0",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.1-355f33",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        