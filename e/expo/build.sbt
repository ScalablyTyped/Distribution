organization := "org.scalablytyped"
name := "expo"
version := "32.0-dt-20190502Z-79b980"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-576bb9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190524Z-5ebd32",
  "org.scalablytyped" %%% "react-native-maps" % "0.24-dt-20190519Z-1783db",
  "org.scalablytyped" %%% "react-native-svg" % "9.4.0-ea87db",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        