organization := "org.scalablytyped"
name := "expo"
version := "32.0-dt-20190502Z-b1ac3d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-97d765",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-56dde3",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190519Z-6c4aa0",
  "org.scalablytyped" %%% "react-native-maps" % "0.24-dt-20190519Z-fa973e",
  "org.scalablytyped" %%% "react-native-svg" % "9.4.0-c29e74",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        