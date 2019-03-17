organization := "org.scalablytyped"
name := "fastify-static"
version := "2.3.4-37f8d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-0cf4fd",
  "org.scalablytyped" %%% "archy" % "0.0-unknown-dt-20180214Z-8a6f42",
  "org.scalablytyped" %%% "avvio" % "6.2.0-2bf11c",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2fa947",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "fastify" % "2.1.0-dabaf9",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-401193",
  "org.scalablytyped" %%% "fastq" % "1.6.0-8c591b",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-a2879d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-55635b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-050324",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-7268dd",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-cebc3d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-ddee67",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-2fa149",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "send" % "v0.14.1-dt-20180214Z-81d2b8",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-420866",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-005ad5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        