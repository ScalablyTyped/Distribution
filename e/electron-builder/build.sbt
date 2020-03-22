organization := "org.scalablytyped"
name := "electron-builder"
version := "22.4.1-c67ec6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "22.4.1-b38e92",
  "org.scalablytyped" %%% "builder-util" % "22.4.1-6f00c0",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.6.2-6faa3e",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-552094",
  "org.scalablytyped" %%% "electron-publish" % "22.4.1-a63280",
  "org.scalablytyped" %%% "fs-extra" % "8.1-dt-20200218Z-c3eca2",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-aa089f",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-99e56d",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200225Z-8f6146",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-fd27cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
