organization := "org.scalablytyped"
name := "dmg-builder"
version := "23.6.0-0de33f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "app-builder-lib" % "23.6.0-614070",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-bb91fe",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-fa87a3",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-abc15b",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.6.0-77d70e",
  "org.scalablytyped" %%% "electron-publish" % "23.6.0-133d31",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20211202Z-7b3c18",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-e19059",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-d75a3b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-6e5079")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
