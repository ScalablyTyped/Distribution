organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-a8e3ab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-9e9935",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190619Z-8d8143",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190613Z-3aa6d7",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20190613Z-28d5ff",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-d7a2eb",
  "org.scalablytyped" %%% "redux" % "4.0.1-3a783a",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        