organization := "org.scalablytyped"
name := "expo"
version := "32.0-dt-20190502Z-026051"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-91817c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-ce0842",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190717Z-735e65",
  "org.scalablytyped" %%% "react-native-maps" % "0.24-dt-20190519Z-ac2214",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.3-3a88fe",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        