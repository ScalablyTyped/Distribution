organization := "org.scalablytyped"
name := "egg-mock"
version := "3.x-dt-20190327Z-12fd11"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-94fd30",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-1927bb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a3203b",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-77f2c0",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-b987ee",
  "org.scalablytyped" %%% "egg" % "2.22.2-103cc4",
  "org.scalablytyped" %%% "egg-cookies" % "2.2.7-0746f4",
  "org.scalablytyped" %%% "egg-core" % "4.17.0-2880eb",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-de8e78",
  "org.scalablytyped" %%% "egg-view" % "2.1.2-6cb20c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-36041d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-59d609",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b7c6ed",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-330fcf",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-f5f2f9",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190322Z-134b1e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-2d4b37",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "urllib" % "2.34.0-ddcadc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        