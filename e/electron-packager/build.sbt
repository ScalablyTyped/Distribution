organization := "org.scalablytyped"
name := "electron-packager"
version := "17.0.0-4276cc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "electron-notarize" % "1.2.1-52cf90",
  "org.scalablytyped" %%% "electron__asar" % "3.2.1-e4a961",
  "org.scalablytyped" %%% "electron__osx-sign" % "1.0.1-75733a",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-3cb2e2",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-374fcc",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
