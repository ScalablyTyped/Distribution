organization := "org.scalablytyped"
name := "egg-core"
version := "4.16.1-753635"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-8da082",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-684e50",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "co" % "4.6-dt-20190216Z-e8411b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-50cbb3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-e977e6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-3b04fa",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-a8a63d",
  "org.scalablytyped" %%% "egg-logger" % "2.4.1-e69c58",
  "org.scalablytyped" %%% "escape-html" % "0.0-unknown-dt-20190322Z-616506",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4aab25",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-faea1f",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-db9e47",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-8bb714",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20190329Z-819655",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-95102e",
  "org.scalablytyped" %%% "globby" % "9.1.0-fabebd",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-0cd2ad",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-f7531d",
  "org.scalablytyped" %%% "ignore" % "3.3.10-4b81ac",
  "org.scalablytyped" %%% "inflection" % "1.5.0-dt-20190322Z-64b193",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20190329Z-4226a6",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-cf9c5c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-2f78df",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2b27d0",
  "org.scalablytyped" %%% "koa-convert" % "1.2-dt-20190212Z-c5d2b8",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-5870cb",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-64a8b0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-e16d89",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-90e988",
  "org.scalablytyped" %%% "mz" % "0.0-unknown-dt-20190322Z-184de5",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-807234",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-dd9008",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-a5cb3a",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "utility" % "1.16.1-af390d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        