organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20190322Z-f58d31"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20190322Z-0d9b07",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-5a7f09",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20190322Z-966fdf",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        