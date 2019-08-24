organization := "org.scalablytyped"
name := "fast-glob"
version := "3.0.4-151f41"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-ac37f8",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-0eaa42",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-cf0508",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        