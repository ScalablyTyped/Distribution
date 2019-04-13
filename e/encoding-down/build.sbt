organization := "org.scalablytyped"
name := "encoding-down"
version := "5.0-dt-20180917Z-ac24fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-120723",
  "org.scalablytyped" %%% "level-codec" % "9.0-dt-20180828Z-88075f",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        