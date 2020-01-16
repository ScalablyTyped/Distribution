organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20190322Z-33de42"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20191126Z-f6ebd9",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-c5f6cd",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20191207Z-29908c",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        