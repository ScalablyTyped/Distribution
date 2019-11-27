organization := "org.scalablytyped"
name := "dmg-builder"
version := "21.2.0-a24c2b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "app-builder-lib" % "21.2.0-d6c629",
  "org.scalablytyped" %%% "builder-util" % "21.2.0-e3ea9d",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-14b574",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-ca3bb7",
  "org.scalablytyped" %%% "electron-publish" % "21.2.0-8eb848",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-4583b4",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-432202",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-0245fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        