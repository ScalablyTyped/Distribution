organization := "org.scalablytyped"
name := "dmg-builder"
version := "21.2.0-ebe65a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-b50cb5",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-e987c7",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-e90778",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-d67e76",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-83efbc",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-9f4990",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-9a21e3",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-954d5c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        