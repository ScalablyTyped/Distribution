organization := "org.scalablytyped"
name := "electron-builder"
version := "21.2.0-42f5bd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-e7308d",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-6178eb",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-cd8056",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-d67e76",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-21c34a",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-0e266b",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-9a21e3",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-954d5c",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-22543c",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-34249b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        