organization := "org.scalablytyped"
name := "fast-glob"
version := "3.2.12-01deab"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-b70fb4",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-4788e1",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-af6a0d",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
