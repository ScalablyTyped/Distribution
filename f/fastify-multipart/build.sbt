organization := "org.scalablytyped"
name := "fastify-multipart"
version := "0.7.0-e0a270"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-76e8a2",
  "org.scalablytyped" %%% "avvio" % "6.1.0-d26192",
  "org.scalablytyped" %%% "busboy" % "v0.2.13-dt-20180214Z-fc6cc6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-065978",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-a36217",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cad354",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "fastify" % "2.0.0-15819d",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-b66352",
  "org.scalablytyped" %%% "fastq" % "1.6.0-ea2400",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-6f9efc",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-9acd8f",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-9bd806",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0a8f8e",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-935d9f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0a9f78",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-6d8032",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-e6a6c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        