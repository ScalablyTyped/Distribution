organization := "org.scalablytyped"
name := "expo__image-utils"
version := "0.3.22-480b64"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp-compact" % "0.16.1-2-33f715",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-bf7f41",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-65a7e2",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-ac2382",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-d9ae35",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-ff86f1",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-8317af",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-4021c7",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-a59888",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-e4c06c",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-4ee18e",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-580e52",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-73de2a",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-7be0ab",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-d28036",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-ccc6f1",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-5471d9",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-618a60",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-124230",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-291b16",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-db4033",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-cf2828",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-048474",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-60cff0",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-9fe0b8",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-ead322",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-5ed14a",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-cc60dd",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-5e9962",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-2bfd7c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
