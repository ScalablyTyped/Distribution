organization := "org.scalablytyped"
name := "fastify-jwt"
version := "0.9.3-4c96be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.2-824407",
  "org.scalablytyped" %%% "avvio" % "6.1.0-a597c4",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-598466",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f61f0c",
  "org.scalablytyped" %%% "fastify" % "2.0.0-55c455",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-f48473",
  "org.scalablytyped" %%% "fastq" % "1.6.0-025475",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-4d385e",
  "org.scalablytyped" %%% "http-errors" % "1.6-dt-20180214Z-e1f7b1",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-a349a5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-9410dc",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-7272f2",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-2503b8",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-c1b943",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-216e1b",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-92275d",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "steed" % "1.1-dt-20180214Z-663060",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-4b6ee3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        