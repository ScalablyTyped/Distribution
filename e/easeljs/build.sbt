organization := "org.scalablytyped"
name := "easeljs"
version := "1.0.0-dt-20190322Z-620c8e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20190322Z-3c61dc",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20190322Z-6ede8a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        