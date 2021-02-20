organization := "org.scalablytyped"
name := "electron-publish"
version := "22.9.1-2be1cf"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "builder-util" % "22.9.1-aba300",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.2-013697",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-c5583a",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20201111Z-36d6e3",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-2a0ab1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-08c1b7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
