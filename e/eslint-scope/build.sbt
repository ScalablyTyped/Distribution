organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180217Z-abc23a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191002Z-540a87",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-5a7f09",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-9fcec6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        