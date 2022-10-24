organization := "org.scalablytyped"
name := "electron-packager"
version := "17.0.0-09db89"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "electron-notarize" % "1.2.1-830f2e",
  "org.scalablytyped" %%% "electron__asar" % "3.2.1-c9b81b",
  "org.scalablytyped" %%% "electron__osx-sign" % "1.0.1-b1aebc",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-fd7ef3",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-19e0f3",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
