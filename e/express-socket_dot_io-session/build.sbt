organization := "org.scalablytyped"
name := "express-socket_dot_io-session"
version := "1.3-dt-20180613Z-1344a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-7d567c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1fb804",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-e5e43b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-6805e6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-68aadd",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20190322Z-a3bd41",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        