organization := "org.scalablytyped"
name := "electron-packager"
version := "15.1.0-a8b776"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "asar" % "3.0.3-6411b4",
  "org.scalablytyped" %%% "electron-notarize" % "1.0.0-c80a7a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-de8bc7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-e93439",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
