organization := "org.scalablytyped"
name := "fastify-jwt"
version := "0.9.5-a2b656"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-0cf4fd",
  "org.scalablytyped" %%% "archy" % "0.0-unknown-dt-20180214Z-8a6f42",
  "org.scalablytyped" %%% "avvio" % "6.2.1-06923a",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2fa947",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "fastify" % "2.1.0-975959",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-a37cab",
  "org.scalablytyped" %%% "fastq" % "1.6.0-8c591b",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-ae9bfc",
  "org.scalablytyped" %%% "http-errors" % "1.6-dt-20180214Z-f03531",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-3cbe3a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190319Z-50285a",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-42cd58",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-cebc3d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-334895",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-b5df74",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-d5d77d",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "steed" % "1.1-dt-20180214Z-929071",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-005ad5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        