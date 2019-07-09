organization := "org.scalablytyped"
name := "globby"
version := "10.0.1-7d7779"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-9ac393",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9fe943",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-41d0ad",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-04adc8",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-dbdbd0",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-d46be3",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        