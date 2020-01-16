organization := "org.scalablytyped"
name := "electron-builder"
version := "21.2.0-58f69e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-2be1e8",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-a4a5a8",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-af8287",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-e686b4",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-508f67",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-84bbb1",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-8b71a6",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-9bf7c9",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200108Z-421d1d",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-47492f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        