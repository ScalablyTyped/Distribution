organization := "org.scalablytyped"
name := "expo__image-utils"
version := "0.3.22-d40b4d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp-compact" % "0.16.1-2-6c9eb2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-ce4ac3",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-f64a4d",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-b9f795",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-f9aa9b",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-243d81",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-cd3333",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-2f7290",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-38216c",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-a31c4a",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-aa4022",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-196db6",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-d72785",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-b2c598",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-91ad0c",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-38a566",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-ca25de",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-dae807",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-335bcc",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-77feec",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-f7660f",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-2ee27e",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-52f2e4",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-ca5ec2",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-23b2ba",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-e5bb13",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-11e003",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-323b21",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-305199",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-5a189b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
