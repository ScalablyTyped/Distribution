organization := "org.scalablytyped"
name := "electron-publish"
version := "22.6.1-fdb26a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "22.6.1-35892a",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.0-fce4a6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-b4ce56",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20200519Z-ccebd9",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-067d8b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-116d48")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
