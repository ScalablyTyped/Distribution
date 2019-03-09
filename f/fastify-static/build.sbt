organization := "org.scalablytyped"
name := "fastify-static"
version := "2.3.4-36d270"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-76e8a2",
  "org.scalablytyped" %%% "avvio" % "6.1.1-5e3edd",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cad354",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "fastify" % "2.0.1-e50eae",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-e7d5c6",
  "org.scalablytyped" %%% "fastq" % "1.6.0-ea2400",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-f48266",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a21654",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-035dec",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-d73413",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0a8f8e",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-1cc6bc",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0aee39",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "send" % "v0.14.1-dt-20180214Z-e1f80a",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-acfcda",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-e6a6c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        