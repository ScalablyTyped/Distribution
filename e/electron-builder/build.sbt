organization := "org.scalablytyped"
name := "electron-builder"
version := "20.44.4-bfa311"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.44.4-378dc1",
  "org.scalablytyped" %%% "builder-util" % "10.1.2-a6c9c2",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-4c8a68",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-fe112c",
  "org.scalablytyped" %%% "electron-publish" % "20.44.4-14f18b",
  "org.scalablytyped" %%% "fs-extra-p" % "8.1.0-293517",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-4f11cf",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-e8b22f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        