organization := "org.scalablytyped"
name := "fast-glob"
version := "3.2.12-d2404a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-44f93b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-70b2e5",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-a19fbd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
