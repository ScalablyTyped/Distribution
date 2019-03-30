organization := "org.scalablytyped"
name := "fastify-multipart"
version := "0.7.0-f83d4f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "archy" % "0.0-unknown-dt-20190322Z-751faa",
  "org.scalablytyped" %%% "avvio" % "6.2.1-2517fb",
  "org.scalablytyped" %%% "busboy" % "v0.2.13-dt-20190322Z-1f5c35",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a1baa5",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-7298d3",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "fastify" % "2.1.0-bb9975",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-001eaf",
  "org.scalablytyped" %%% "fastq" % "1.6.0-da4a5e",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-8ca891",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190319Z-fea8b4",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-bda662",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-c565bc",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-195cbe",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-d8e229",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        