organization := "org.scalablytyped"
name := "expo__image-utils"
version := "0.3.22-569413"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp-compact" % "0.16.1-2-6a5e2d",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-5c2fea",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-3a1ef3",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-409e47",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-7197ca",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-0f070f",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-4efc78",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-499804",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-2cbe5f",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-98aec7",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-6ee53b",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-3af218",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-67d0cb",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-2e20cd",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-cd9b29",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-0a90da",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-82db42",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-5c027b",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-460435",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-f8ca0b",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-45c7d1",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-a3ec63",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-b6c581",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-da70f0",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-7a9854",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-bf217f",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-b0f675",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-4f5a41",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-6ecd7f",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-c8f4b1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
