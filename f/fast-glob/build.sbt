organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.7-74c8b3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20190422Z-55018e",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20191113Z-d1c8ee",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-4f2a9c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        