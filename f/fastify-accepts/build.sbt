organization := "org.scalablytyped"
name := "fastify-accepts"
version := "0.5-dt-20181119Z-a103aa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-0bdd08",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "archy" % "0.0-unknown-dt-20190322Z-751faa",
  "org.scalablytyped" %%% "avvio" % "6.2.1-1b9f11",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a1baa5",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "fast-json-stringify" % "1.14.0-548fc3",
  "org.scalablytyped" %%% "fastify" % "2.2.0-aa3e60",
  "org.scalablytyped" %%% "fastq" % "1.6.0-da4a5e",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-fdb020",
  "org.scalablytyped" %%% "light-my-request" % "3.3.0-a4c08f",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190319Z-33587c",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-51e044",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-fea888",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-5d06ef",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-6d243a",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        