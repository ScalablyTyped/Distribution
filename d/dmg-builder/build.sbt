organization := "org.scalablytyped"
name := "dmg-builder"
version := "23.6.0-137b99"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "app-builder-lib" % "23.6.0-fc32ee",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-3e5dc1",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-024a55",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-29b158",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-8a6d85",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-c2c58e",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-888127",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-2a5f76")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
