organization := "org.scalablytyped"
name := "electron-builder"
version := "20.44.4-3828f3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "10.1.2-2170e1",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-b1b290",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-96b05c",
  "org.scalablytyped" %%% "electron-publish" % "20.44.4-97399a",
  "org.scalablytyped" %%% "fs-extra-p" % "8.1.0-ae03f3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-d26ab4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        