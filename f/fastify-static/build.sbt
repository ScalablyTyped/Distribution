organization := "org.scalablytyped"
name := "fastify-static"
version := "2.4.0-3dabc7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "archy" % "0.0-unknown-dt-20190322Z-751faa",
  "org.scalablytyped" %%% "avvio" % "6.2.1-96eb99",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a1baa5",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "fast-json-stringify" % "1.14.0-548fc3",
  "org.scalablytyped" %%% "fastify" % "2.2.0-39a94c",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-54ec4b",
  "org.scalablytyped" %%% "fastq" % "1.6.0-da4a5e",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-47b146",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a3b219",
  "org.scalablytyped" %%% "light-my-request" % "3.3.0-db4581",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190319Z-b80de1",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-8ac627",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-30845c",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-cc6aa4",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "send" % "v0.14.1-dt-20190322Z-663c64",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-dede31",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        