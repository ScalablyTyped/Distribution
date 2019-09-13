organization := "org.scalablytyped"
name := "electron-builder"
version := "20.44.4-1edcb9"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "20.44.4-3b4f88",
  "org.scalablytyped" %%% "builder-util" % "10.1.2-6288cd",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-9e0fcb",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-d138d9",
  "org.scalablytyped" %%% "electron-publish" % "20.44.4-9b16bb",
  "org.scalablytyped" %%% "fs-extra-p" % "8.1.0-ce8cad",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-09a7af",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-0f9a14")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        