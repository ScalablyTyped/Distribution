organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20190327Z-0fafb6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-25464d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-041fae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0256e3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-446bfc",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-0238ad",
  "org.scalablytyped" %%% "egg" % "2.22.2-df7ba9",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-081e11",
  "org.scalablytyped" %%% "egg-core" % "4.17.3-c78107",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-3e71e5",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-199244",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-2f223f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-5ccdcb",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-271e7b",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-143b01",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-1188af",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190627Z-3e7657",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-496baf",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "urllib" % "2.34.0-5b9898")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        