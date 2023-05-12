organization := "org.scalablytyped"
name := "electron-packager"
version := "17.1.1-704774"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-f1b33e",
  "org.scalablytyped" %%% "electron__asar" % "3.2.1-46cdbc",
  "org.scalablytyped" %%% "electron__notarize" % "1.2.3-852566",
  "org.scalablytyped" %%% "electron__osx-sign" % "1.0.1-f25a77",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-d75a3b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
