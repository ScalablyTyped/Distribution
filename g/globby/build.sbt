organization := "org.scalablytyped"
name := "globby"
version := "10.0.1-5d3255"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-980cd5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-f7d416",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c93eb3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-a1861e",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-fdcfaa",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-96c00f",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        