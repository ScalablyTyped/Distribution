organization := "org.scalablytyped"
name := "fastify-multipart"
version := "0.7.0-235231"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-0cf4fd",
  "org.scalablytyped" %%% "avvio" % "6.1.1-68f089",
  "org.scalablytyped" %%% "busboy" % "v0.2.13-dt-20180214Z-eb4e8e",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-4b2fad",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-2dba30",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2fa947",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "fastify" % "2.0.1-7ef44f",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-a6cb23",
  "org.scalablytyped" %%% "fastq" % "1.6.0-8c591b",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-31abc3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-9659bb",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-7809b7",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-cebc3d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-b635c8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-fef2c2",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-3c47f4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-005ad5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        