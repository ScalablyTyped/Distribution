organization := "org.scalablytyped"
name := "electron-publish"
version := "23.6.0-1913f5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util" % "23.6.0-5c3637",
  "org.scalablytyped" %%% "builder-util-runtime" % "9.1.1-b14df2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-f1b33e",
  "org.scalablytyped" %%% "fs-extra" % "11.0-dt-20230228Z-408c31",
  "org.scalablytyped" %%% "jsonfile" % "6.1-dt-20230108Z-5f1891",
  "org.scalablytyped" %%% "lazy-val" % "1.0.5-834e76",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-d75a3b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "temp-file" % "3.4.0-e21226")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
