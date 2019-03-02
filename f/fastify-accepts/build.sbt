organization := "org.scalablytyped"
name := "fastify-accepts"
version := "0.5-dt-20181119Z-63abde"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e77a7c",
  "org.scalablytyped" %%% "ajv" % "6.9.2-824407",
  "org.scalablytyped" %%% "avvio" % "6.1.0-3a0eb2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-598466",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f61f0c",
  "org.scalablytyped" %%% "fastify" % "2.0.0-e266a1",
  "org.scalablytyped" %%% "fastq" % "1.6.0-025475",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-cd1ad0",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-05dbe7",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-550fe6",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-2503b8",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-0e0473",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-a4554d",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-153037",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-4b6ee3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        