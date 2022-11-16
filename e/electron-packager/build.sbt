organization := "org.scalablytyped"
name := "electron-packager"
version := "17.1.1-f8b5d5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-46fecc",
  "org.scalablytyped" %%% "electron__asar" % "3.2.1-0482f1",
  "org.scalablytyped" %%% "electron__notarize" % "1.2.3-e95909",
  "org.scalablytyped" %%% "electron__osx-sign" % "1.0.1-bba847",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-d5113e",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-7e6dc6",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
