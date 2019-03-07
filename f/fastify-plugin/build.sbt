organization := "org.scalablytyped"
name := "fastify-plugin"
version := "1.5.0-4c446b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-76e8a2",
  "org.scalablytyped" %%% "avvio" % "6.1.1-4e52d1",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cad354",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "fastify" % "2.0.1-5f5b9c",
  "org.scalablytyped" %%% "fastq" % "1.6.0-ea2400",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-ac82be",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-620da8",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-833245",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0a8f8e",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-34cfd1",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-65f44d",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-b2b385",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-e6a6c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        