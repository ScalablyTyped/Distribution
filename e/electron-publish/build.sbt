organization := "org.scalablytyped"
name := "electron-publish"
version := "20.41.0-5eb399"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "builder-util" % "10.0.0-324c66",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.2-2b61d8",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-dbddcd",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-dc9453",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-158f9a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        