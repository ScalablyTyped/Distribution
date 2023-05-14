organization := "org.scalablytyped"
name := "electron-builder"
version := "23.6.0-0524d5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "app-builder-lib" % "23.6.0-310972",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-7fd551",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-04c2ac",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-f1b33e",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-788d55",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-63af8b",
  "org.scalablytyped" %%% "fs-extra" % "11.0-dt-20230228Z-3b6f4a",
  "org.scalablytyped" %%% "jsonfile" % "6.1-dt-20230108Z-7b95a5",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-834e76",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-d75a3b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-e21226")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
