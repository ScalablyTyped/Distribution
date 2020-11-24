organization := "org.scalablytyped"
name := "electron-packager"
version := "15.1.0-e4c8c5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "asar" % "3.0.3-4662e3",
  "org.scalablytyped" %%% "electron-notarize" % "1.0.0-49fd03",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-3075c2",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-bab05f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
