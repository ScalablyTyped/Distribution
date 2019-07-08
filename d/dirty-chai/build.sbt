organization := "org.scalablytyped"
name := "dirty-chai"
version := "2.0-dt-20190514Z-f7a7e5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-f64226",
  "org.scalablytyped" %%% "chai-as-promised" % "7.1.0-dt-20190322Z-5b21b3",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        