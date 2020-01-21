organization := "org.scalablytyped"
name := "eslint-plugin-react"
version := "7.18.0-831b08"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191126Z-9a0ef8",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-2743ff",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20191223Z-2bdb6c",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        