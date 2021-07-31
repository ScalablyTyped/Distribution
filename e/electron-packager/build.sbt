organization := "org.scalablytyped"
name := "electron-packager"
version := "15.1.0-a8623b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "asar" % "3.0.3-bb2ddd",
  "org.scalablytyped" %%% "electron-notarize" % "1.0.0-40ac37",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-f6476c",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-916fd1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
