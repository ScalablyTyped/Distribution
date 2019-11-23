organization := "org.scalablytyped"
name := "falcor-express"
version := "0.1.2-dt-20190711Z-6e0cb0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b36108",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0f3dc",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-24df32",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4dd221",
  "org.scalablytyped" %%% "falcor" % "2.0-dt-20190711Z-71effe",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20190711Z-5a94e7",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20190711Z-291122",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-37db83",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        