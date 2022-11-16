organization := "org.scalablytyped"
name := "expo__image-utils"
version := "0.3.23-2c7035"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp-compact" % "0.16.1-2-f46c2c",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-f53d67",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-f1a548",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-a84202",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-6c08f9",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-a99938",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-fe8065",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-514ac4",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-4dcf50",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-6b0362",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-deefee",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-b793f0",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-6c48eb",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-4573fa",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-cb94e4",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-cf38a4",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-7a9a62",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-d3930a",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-c56a7d",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-0f5d88",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-42b4e6",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-107870",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-832f0f",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-638b88",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-2b4403",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-7cd43c",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-e3175b",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-5d2cd9",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-a83941",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-e1dec3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
