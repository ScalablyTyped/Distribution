organization := "org.scalablytyped"
name := "electron-builder"
version := "21.2.0-33902b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-133cb2",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-121cc5",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-d9bc82",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-231f7d",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-811693",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-4c34ac",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-61e142",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-809627",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200131Z-03bed8",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-3a25a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
