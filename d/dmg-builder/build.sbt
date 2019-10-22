organization := "org.scalablytyped"
name := "dmg-builder"
version := "21.2.0-dfbfda"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-c8f09a",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-442a93",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-d0858d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-3d3404",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-6d73a6",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-6f4cb1",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-03a464",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-8963f5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        