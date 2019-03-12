organization := "org.scalablytyped"
name := "fastify"
version := "2.0.1-a0c158"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-0cf4fd",
  "org.scalablytyped" %%% "avvio" % "6.1.1-7f99bd",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2fa947",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "fastq" % "1.6.0-8c591b",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-fdb8a7",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-643c32",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-248f09",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-cebc3d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-8e905e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-696ff5",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-653573",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-005ad5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        