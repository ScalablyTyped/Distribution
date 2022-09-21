organization := "org.scalablytyped"
name := "dmg-builder"
version := "23.5.1-ffef23"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "app-builder-lib" % "23.5.1-d62c61",
  "org.scalablytyped" %%% "builder-util" % "23.5.0-34f2e1",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-2878f7",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-139f7f",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-f95178",
  "org.scalablytyped" %%% "electron-publish" % "23.5.0-c83880",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-bb71f5",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-3f22af",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-70133d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
