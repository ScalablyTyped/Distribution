organization := "org.scalablytyped"
name := "electron-builder"
version := "21.2.0-ef449d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-efab6f",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-ad6488",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-91b159",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-ca3bb7",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-260cfa",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-dd0988",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-432202",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-0245fc",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191126Z-efb256",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-f741f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        