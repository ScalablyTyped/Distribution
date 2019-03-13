organization := "org.scalablytyped"
name := "egg-core"
version := "4.15.0-cf9c51"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e0a1e8",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-052e82",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-97355d",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6d01d0",
  "org.scalablytyped" %%% "co" % "4.6-dt-20190216Z-bd6260",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a9f21d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-7fbe93",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-3a8588",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-6b9642",
  "org.scalablytyped" %%% "egg-logger" % "2.3.2-b0b337",
  "org.scalablytyped" %%% "escape-html" % "0.0-unknown-dt-20180214Z-249d0e",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-1f537b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-896760",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-bea529",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-69e556",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-288ee1",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-9d06cf",
  "org.scalablytyped" %%% "globby" % "9.1.0-14a2d1",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-07f032",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-37fb47",
  "org.scalablytyped" %%% "ignore" % "3.3.10-bb014f",
  "org.scalablytyped" %%% "inflection" % "1.5.0-dt-20180214Z-f5fcfc",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-96c7ba",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-490764",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2880d6",
  "org.scalablytyped" %%% "koa-convert" % "1.2-dt-20190212Z-c58afd",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-8d8873",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-3ed78d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-e36770",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-84f869",
  "org.scalablytyped" %%% "mz" % "0.0-unknown-dt-20181121Z-f64389",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-c86c20",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-e46030",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-adddb4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "utility" % "1.15.1-152af0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        