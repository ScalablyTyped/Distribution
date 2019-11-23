organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20190327Z-e8277b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e4863f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b36108",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0f3dc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-fe9222",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-94da27",
  "org.scalablytyped" %%% "egg" % "2.25.0-94ca69",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-9c8412",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-fd1f72",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-7c25f2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-24df32",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4dd221",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-ef73cd",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20191016Z-3942fa",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-37db83",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "urllib" % "2.34.1-131e1b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        