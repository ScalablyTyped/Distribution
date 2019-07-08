organization := "org.scalablytyped"
name := "eonasdan-bootstrap-datetimepicker"
version := "v4.17.37-dt-20190322Z-8e97e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190624Z-b9b940",
  "org.scalablytyped" %%% "moment" % "2.24.0-fbb2c3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-c53ffb",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        