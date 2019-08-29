organization := "org.scalablytyped"
name := "globby"
version := "10.0.1-809be7"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-c1f83c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7105af",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c93eb3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-e90e9e",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-c2e7d7",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-0a9fba",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        