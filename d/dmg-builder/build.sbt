organization := "org.scalablytyped"
name := "dmg-builder"
version := "21.2.0-b962ce"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-fa41a7",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-24aad5",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-a99f5c",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-fa372c",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-27ee8f",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-ae42e1",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-674b2d",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-78f8f2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        