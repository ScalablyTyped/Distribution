organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.7.2-b9c82c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.44.4-0992a7",
  "org.scalablytyped" %%% "builder-util" % "10.1.2-2dbafa",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-3919fb",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-d7c1c4",
  "org.scalablytyped" %%% "electron-publish" % "20.44.4-1a9feb",
  "org.scalablytyped" %%% "fs-extra-p" % "8.0.2-900653",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-0819b0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "temp-file" % "3.3.3-a50bf7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        