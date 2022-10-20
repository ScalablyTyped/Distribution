organization := "org.scalablytyped"
name := "electron-builder"
version := "23.6.0-226734"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "app-builder-lib" % "23.6.0-22fa27",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-c424a5",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-f9e09f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-29b158",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-0aaf34",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-482a78",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-888127",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-2a5f76",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-ba1b24",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-c0cd73")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
