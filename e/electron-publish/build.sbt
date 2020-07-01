organization := "org.scalablytyped"
name := "electron-publish"
version := "22.7.0-2b27eb"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "22.7.0-9f904b",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.1-200947",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-70bc6c",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20200519Z-e4b55e",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-0707f4",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-386723")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
