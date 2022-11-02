organization := "org.scalablytyped"
name := "globaloffensive"
version := "2.2-dt-20220411Z-90ab0a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bytebuffer" % "5.0.0-dt-20220818Z-7c4771",
  "org.scalablytyped" %%% "file-manager" % "2.0-dt-20220829Z-fa652e",
  "org.scalablytyped" %%% "long" % "5.2.0-0a8d47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "steam-user" % "4.23-dt-20220909Z-ecafce",
  "org.scalablytyped" %%% "steamid" % "2.0-dt-20211202Z-0cda09")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
