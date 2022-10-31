organization := "org.scalablytyped"
name := "expo__image-utils"
version := "0.3.22-7695fe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp-compact" % "0.16.1-2-bf5518",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-fec207",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-75b22e",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-b0c2cb",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-8c18fa",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-6c278b",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-2fb3b5",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-4941f8",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-71db4f",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-e3388e",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-450873",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-d51494",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-d6ab2a",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-071426",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-1d7797",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-4befc2",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-0e266b",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-f7493c",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-652eb0",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-0d29f8",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-0cc71e",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-81d006",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-b63f78",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-01eade",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-62951a",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-e045a2",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-6bf053",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-ac3f23",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-9f4f30",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-b6be23",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
