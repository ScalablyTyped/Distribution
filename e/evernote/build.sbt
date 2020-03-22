organization := "org.scalablytyped"
name := "evernote"
version := "1.25.8-dt-20190322Z-9aa882"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "node-int64" % "v0.4.0-dt-20190322Z-6db66f",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-aa5e08",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "thrift" % "0.10-dt-20191223Z-64fbc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
