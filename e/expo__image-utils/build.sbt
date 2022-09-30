organization := "org.scalablytyped"
name := "expo__image-utils"
version := "0.3.22-06cb05"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp-compact" % "0.16.1-2-471ca0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-9b5300",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-dc002f",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-4f31ff",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-418924",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-17ad5a",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-97a0f9",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-534119",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-7e6f31",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-a46388",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-42ed7f",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-a3593e",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-0bcf08",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-17cb8b",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-67373c",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-bee92f",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-4fb4c5",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-f91a06",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-2c25c2",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-4cf4f1",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-0a3cfd",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-91166b",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-ab2292",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-eac519",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-95147c",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-ae1e7f",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-f27ebb",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-dc8262",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-7f26a6",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-06c00d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
