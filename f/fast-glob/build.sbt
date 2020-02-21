organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.7-a5f0bd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20190422Z-7eca32",
  "org.scalablytyped" %%% "micromatch" % "4.0-dt-20200127Z-1a75cf",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-61cabd",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
