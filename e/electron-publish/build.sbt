organization := "org.scalablytyped"
name := "electron-publish"
version := "20.39.0-0980f6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-5642b2",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-5cc69b",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-b43721",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-59d994",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-7f2dcb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        