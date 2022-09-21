organization := "org.scalablytyped"
name := "globby"
version := "13.1.2-dab2ef"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-168ee0",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-40e953",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-edcf29",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-bccb6e",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
