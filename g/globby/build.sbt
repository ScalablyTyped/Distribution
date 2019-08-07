organization := "org.scalablytyped"
name := "globby"
version := "10.0.1-124d3c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-cf5154",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-cfb513",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-40806c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-5e6fc7",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-83bb35",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-3f74e3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        