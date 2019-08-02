organization := "org.scalablytyped"
name := "dynogels"
version := "9.0-dt-20190626Z-ad5abf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk" % "2.503.0-75b70c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-8ac771",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        