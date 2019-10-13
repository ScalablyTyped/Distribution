organization := "org.scalablytyped"
name := "dmg-builder"
version := "21.2.0-38ddd0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-f3cb80",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-b0a1e2",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-df5ec4",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-3d3404",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-5c6ea1",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20190626Z-3030ce",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-03a464",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-8963f5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        