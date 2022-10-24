organization := "org.scalablytyped"
name := "globby"
version := "13.1.2-6319f7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-305d37",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-b40b4e",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-908e5e",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-292439",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
