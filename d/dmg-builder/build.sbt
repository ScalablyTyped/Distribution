organization := "org.scalablytyped"
name := "dmg-builder"
version := "21.2.0-4d3e6f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-95747d",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-008cad",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-f6a469",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-d138d9",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-8a0166",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20190626Z-bec1d8",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-09a7af",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-0f9a14")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        