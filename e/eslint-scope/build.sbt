organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180217Z-13d06a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191023Z-842fa4",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-189c55",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-a1a6ec",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        