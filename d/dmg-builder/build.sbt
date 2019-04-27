organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.6.0-961478"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.39.0-467353",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-664016",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-974da9",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-b43721",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-226cc8",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-bd2f5f",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-63a268",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-7f2dcb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        