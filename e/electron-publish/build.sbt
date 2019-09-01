organization := "org.scalablytyped"
name := "electron-publish"
version := "20.44.4-ebe4be"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "10.1.2-47fa71",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-cacdab",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-d138d9",
  "org.scalablytyped" %%% "fs-extra-p" % "8.1.0-fee27d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-0f9a14")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        