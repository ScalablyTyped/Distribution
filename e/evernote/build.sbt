organization := "org.scalablytyped"
name := "evernote"
version := "1.25.8-dt-20190322Z-16b75e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "node-int64" % "v0.4.0-dt-20190322Z-7db7ef",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-44e2c6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "thrift" % "0.10-dt-20190212Z-b9157c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        