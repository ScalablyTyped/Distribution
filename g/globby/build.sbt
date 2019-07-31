organization := "org.scalablytyped"
name := "globby"
version := "10.0.1-2c2087"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-c4bf50",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-370be5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-40806c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-bbadaf",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-bad054",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-995706",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        