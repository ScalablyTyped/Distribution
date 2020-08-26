organization := "org.scalablytyped"
name := "eonasdan-bootstrap-datetimepicker"
version := "v4.17.37-dt-20200515Z-0084f5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-02ea23",
  "org.scalablytyped" %%% "moment" % "2.27.0-2a4db1",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-078440",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
