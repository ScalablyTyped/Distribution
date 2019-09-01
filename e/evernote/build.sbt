organization := "org.scalablytyped"
name := "evernote"
version := "1.25.8-dt-20190322Z-d6a108"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "node-int64" % "v0.4.0-dt-20190322Z-b89dc7",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-ff56fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "thrift" % "0.10-dt-20190212Z-7d84c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        