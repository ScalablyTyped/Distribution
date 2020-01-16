organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.7-9c2f1f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20190422Z-2104d8",
  "org.scalablytyped" %%% "micromatch" % "4.0-dt-20200107Z-ccb0cc",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-772947",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        