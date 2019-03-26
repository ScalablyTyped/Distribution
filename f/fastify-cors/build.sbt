organization := "org.scalablytyped"
name := "fastify-cors"
version := "2.1.2-5440cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-7799d3",
  "org.scalablytyped" %%% "archy" % "0.0-unknown-dt-20190322Z-69ed54",
  "org.scalablytyped" %%% "avvio" % "6.2.1-f0d284",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cbad63",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-130897",
  "org.scalablytyped" %%% "fastify" % "2.1.0-701426",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-3021ce",
  "org.scalablytyped" %%% "fastq" % "1.6.0-77f776",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-9bda46",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190319Z-c1047d",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-e33b82",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6f3a8b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-889e65",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1895d1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-6849d2",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-d68e3d",
  "org.scalablytyped" %%% "vary" % "1.1-dt-20180214Z-a1097e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        