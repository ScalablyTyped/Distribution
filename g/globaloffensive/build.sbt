organization := "org.scalablytyped"
name := "globaloffensive"
version := "2.2-dt-20220411Z-be3aec"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bytebuffer" % "5.0.0-dt-20220818Z-787ccd",
  "org.scalablytyped" %%% "file-manager" % "2.0-dt-20220829Z-0c3b90",
  "org.scalablytyped" %%% "long" % "5.2.0-dc3994",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "steam-user" % "4.23-dt-20220909Z-0c6004",
  "org.scalablytyped" %%% "steamid" % "2.0-dt-20211202Z-69f8cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
