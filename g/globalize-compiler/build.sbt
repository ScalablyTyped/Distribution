organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20190322Z-de74f1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20191119Z-5e830c",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191119Z-189c55",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20190322Z-4adfa4",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        