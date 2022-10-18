organization := "org.scalablytyped"
name := "globby"
version := "13.1.2-f5b4cd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-5c9a0e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-ce5cf4",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-760eb6",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-eb3d01",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
