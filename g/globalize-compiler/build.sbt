organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20190322Z-bb71ed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20190322Z-9fe621",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-94c22f",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20190322Z-51bf2e",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        