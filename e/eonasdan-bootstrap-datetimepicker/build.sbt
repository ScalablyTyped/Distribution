organization := "org.scalablytyped"
name := "eonasdan-bootstrap-datetimepicker"
version := "v4.17.37-dt-20191115Z-98a1b1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-13d8c2",
  "org.scalablytyped" %%% "moment" % "2.24.0-8ebd48",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-95a8d0",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        